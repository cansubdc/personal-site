package com.cansubdc.site.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.function.Function;

@Configuration
public class SecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager(){
        Function <String,String> passwordEncoder = input -> passwordEncoder().encode(input);
        UserDetails userDetails = User.builder()
                                    .passwordEncoder(passwordEncoder)
                                    .username("cansu")
                                    .password("123")
                                    .roles("USER","ADMIN")
                                    .build();

        return new InMemoryUserDetailsManager(userDetails);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/h2-console/**").permitAll() // H2 Console'a herkes ulaşabilsin
                .requestMatchers(HttpMethod.GET, "/posts/**").permitAll() // Postları listelemek herkese serbest
                .requestMatchers(HttpMethod.POST, "/posts/**").hasRole("ADMIN") // Yeni post eklemek sadece ADMIN
                .requestMatchers(HttpMethod.DELETE, "/posts/**").hasRole("ADMIN") // Post silmek sadece ADMIN
                .anyRequest().authenticated());

        http.formLogin(Customizer.withDefaults());

        http.csrf(csrf -> csrf.
                ignoringRequestMatchers("/h2-console/**"));
        http.csrf(csrf -> csrf.disable());
        http.headers(headers -> headers
                .frameOptions(frame -> frame
                        .sameOrigin()));

        return http.build();
    }

}

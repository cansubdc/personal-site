insert into POST (ID , USER_ID, TITLE, DESCRIPTION, CONTENT)
values(1, 1,'Java 101', 'desc1', 'test1');

insert into POST (ID , USER_ID, TITLE, DESCRIPTION, CONTENT)
values(2, 1,'Spring 101', 'desc2', 'test2');

insert into POST (ID , USER_ID, TITLE, DESCRIPTION, CONTENT)
values(3, 1,'AWS 101', 'desc3', 'test3');

insert into POST (ID , USER_ID, TITLE, DESCRIPTION, CONTENT)
values(4, 1,'Microservice 101', 'desc4', 'test4');

insert into POST (ID , USER_ID, TITLE, DESCRIPTION, CONTENT)
values(5, 1,'Kafka 101', 'desc5', 'test5');


ALTER TABLE post ALTER COLUMN id RESTART WITH 100;
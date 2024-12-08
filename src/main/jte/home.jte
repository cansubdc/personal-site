@param com.cansubdc.site.controller.HomeController.HomePage homePage
@param java.util.List<com.cansubdc.site.entity.Post> posts
@param String username

@template.index(
headElements = @`
    <title>${homePage.title()}</title>
    <meta name = "description" content = "${homePage.descr()}">
`
,
content = @`
    <div>
        <div> Welcome to Web Site  </div>
    </div>
`

)

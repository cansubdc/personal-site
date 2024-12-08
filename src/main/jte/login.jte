@param com.cansubdc.site.controller.LoginController.LoginPage loginPage
@param String errorMessage

@template.index(
headElements = @`
<title>${loginPage.title()}</title>
<meta name = "description" content = "${loginPage.descr()}">
`
,
content = @`
<div>
    <form action="/login" method="post">
        <div>
            <div>
                <input type ="text" name="username" placeholder="username">
            </div>
            <div>
                <input type ="text" name="password" placeholder="password">
            </div>
            <div>
                <output>${errorMessage}</output>
            </div>
            <div>
                <button type="submit"> Login </button>
            </div>
        </div>
    </form>
</div>
`

)




@param com.cansubdc.site.entity.Post post
<!DOCTYPE html>

@template.index(
headElements = @`
<title>Hello JTE</title>
`
,
content = @`
    <div>
        <h1>Enter Your Post Details</h1>
    </div>
    <div>
        <form action="/posts/${post.getId()}/update" method="post">
            <div>
                <div>
                    <input type ="text" name="title" class = "mb-3" value="${post.getTitle()}"  required="required">
                </div>
                <div>
                    <input type ="text" name="description" class = "mb-3" value="${post.getDescription()}" required="required">
                </div>
                <div>
                    <input type ="text" name="content" class = "mb-3" value="${post.getContent()}" required="required">
                </div>
                <div>
                    <button type="submit"> Update </button>
                </div>
            </div>
        </form>
    </div>
`

)
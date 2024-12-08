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
        <form action="/posts/create" method="post">
            <div>
                <div>
                    <input type ="text" name="title" placeholder="Title" required="required">
                </div>
                <div>
                    <input type ="text" name="description" placeholder="Description" required="required">
                </div>
                <div>
                    <input type ="text" name="content" placeholder="Content" required="required">
                </div>
                <div>
                    <button type="submit"> Submit </button>
                </div>
            </div>
        </form>
    </div>
`

)
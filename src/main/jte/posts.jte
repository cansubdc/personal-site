@param java.util.List<com.cansubdc.site.entity.Post> posts

@template.index(
headElements = @`
    <title>Posts</title>
    <link href="/css/posts.css" rel="stylesheet">
`
,
content = @`
    <div> Posts  </div>
    <table>
        @if(posts.isEmpty())
            <tr> You have no post </tr>
        @else
            <tr>
                <th> Title </th>
                <th> Description </th>
                <th> Content </th>
                <th>  </th>
                <th>  </th>
            </tr>
            @for(com.cansubdc.site.entity.Post post: posts)
                <tr>
                    <td> ${post.getTitle()} </td>
                    <td> ${post.getDescription()}</td>
                    <td>${post.getContent()} </td>
                    <td>
                        <form action = "/posts/${post.getId()}/update" method = "get">
                            <button type="submit" class="btn btn-warning" > Update </button>
                        </form>
                    </td>
                    <td>
                        <form action = "/posts/${post.getId()}/delete" method = "post">
                            <button type="submit" class="btn btn-warning" > Delete </button>
                        </form>
                    </td>
                </tr>
            @endfor
            <p>You have ${posts.size()} posts </p>
        @endif
    </table>
    <div>
        <a href="posts/create" > Add Post</a>
    </div>
`

)
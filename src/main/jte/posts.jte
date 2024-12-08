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
            </tr>
            @for(com.cansubdc.site.entity.Post post: posts)
                <tr>
                    <td> ${post.getTitle()} </td>
                    <td> ${post.getDescription()}</td>
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
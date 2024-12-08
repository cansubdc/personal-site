@param gg.jte.Content content
@param gg.jte.Content headElements

<!DOCTYPE html>

<html>
    <head>
        @if(headElements != null)
            ${headElements}

        @else
            <title> Personal WebSite </title>
        @endif
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="/css/base.css" rel="stylesheet">
    </head>
    <body>
    <!-- Navigation -->

    <!-- Content -->
    <container>
        <div>
            ${content}
        </div>
    </container>

    <!-- Footer -->


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"></script>
    </body>
</html>
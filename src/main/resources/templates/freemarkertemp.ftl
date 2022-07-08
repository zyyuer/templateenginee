<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Freemarker</title>
    <link href="/webjars/bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <table class="table">
        <tr>
            <td>作者</td>
            <td>标题</td>
            <td>内容</td>
        </tr>
        <#list articles as article>
            <tr>
                <td>${article.author}</td>
                <td>${article.title}</td>
                <td>${article.content}</td>
            </tr>
        </#list>
    </table>
</div>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
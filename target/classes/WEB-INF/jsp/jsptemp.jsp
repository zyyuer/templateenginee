<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/7/5
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%--/boot-launch 正式发布时候使用这个--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Xbox</title>
    <link rel="shortcut icon" href="${contextPath}/favicon.ico">
    <link rel="stylesheet" href="${contextPath}/css/bootstrap.min.css">
</head>
<body>
<table class="table">
    <tr>
        <td>作者</td>
        <td>标题</td>
        <td>内容</td>
    </tr>
    <c:forEach var="article" items="${articles}">
        <tr class="text-info">
            <td>${article.author}</td>
            <td>${article.title}</td>
            <td>${article.content}</td>
        </tr>
    </c:forEach>
</table>
<img src="${contextPath}/image/xbox.png"/>
<script src="${contextPath}/js/jquery.min.js"></script>
<script src="${contextPath}/js/bootstrap.min.js"></script>

</body>
</html>

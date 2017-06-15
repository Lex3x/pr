<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<html>
<head>
    <title>Simple</title>
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
    <style>body{background-color: lightcyan;}</style>
</head>
<body>

<form action="/main" method="get">
    <input class="btn btn-primary btn-lg" type="submit" name="button1" value="Главная страница" />
</form>

<h2>Список пользователей</h2>
<table class="table table-hover">
    <th>Id</th>
    <th>Название</th>
    <th>Автор</th>
    <th>Год издания</th>


    <c:forEach items="${bookList}" var="item">
        <tr>
            <td>${item.idBook}</td>
            <td>${item.bookName}</td>
            <td>${item.bookAuthor}</td>
            <td>${item.bookYear}</td>
        </tr>
    </c:forEach>

</table>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>

</body>
</html>
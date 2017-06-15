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
        <th>Роль</th>
        <th>Логин</th>
        <th>Пароль</th>
        <th>Изменить</th>
        <th>Удалить</th>

        <c:forEach items="${userList}" var="item">
            <tr>
                <td>${item.idUser}</td>
                <td>${item.role.name}</td>
                <td>${item.login}</td>
                <td>${item.password}</td>
                <td><a href="/users/edit?id=${item.idUser}">Изменить</a></td>
                <td><a href="/users/delete?id=${item.idUser}">Удалить</a></td>
            </tr>
        </c:forEach>

    </table>

    <h2>Добавить запись</h2>

    <h3> Роли: 1-USER</h3>
    <h3> Роли: 2-ADMIN</h3>

    <form method="post" action="/users/add">
        <h4>Id-роль</h4>
        <input type="text" name="role">
        <h4>Логин</h4>
        <input type="text" name="login">
        <h4>Пароль</h4>
        <input type="text" name="password">
        <br>

        <input class="btn btn-success" type="submit" name="button1" value="Добавить" />
    </form>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="static/js/bootstrap.min.js"></script>

</body>
</html>

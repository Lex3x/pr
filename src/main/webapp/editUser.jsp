<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib prefix="x" uri="http://java.sun.com/jstl/xml" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<html>
<head>
    <title>User</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <style>body{background-color: lightcyan;}</style>
</head>
<body>

    <form action="/main" method="get">
        <input class="btn btn-primary btn-lg" type="submit" name="button1" value="Главная страница" />
    </form>

    <h2>Изменить запись</h2>

    <form method="post" action="/users/edit">
        <input type="hidden" name="id" value="${user.idUser}">

        <h4>Роль</h4>
        <input type="text" name="role" value="${user.role.idRole}">
        <h4>Логин</h4>
        <input type="text" name="login" value="${user.login}">
        <h4>Пароль</h4>
        <input type="text" name="password" value="${user.password}">

        <br><br>
        <input class="btn btn-success" type="submit" name="button1" value="Изменить" />
    </form>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>

</body>
</html>

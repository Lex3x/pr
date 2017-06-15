<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<html>
    <head>
        <title>PAGE 1</title>
        <link href="static/css/bootstrap.min.css" rel="stylesheet">
        <style>body{background-color: lightcyan;}</style>
    </head>

    <body>
        <img src="static/img/book1.jpg" class="img-rounded">
        <img src="static/img/book2.jpg" class="img-rounded">
        <img src="static/img/book3.jpg" class="img-rounded">

        <form action="/userList" method="GET">
            <button type="submit" name="button" value="button1">GET USER LIST</button>
        </form>
        <form action="/bookList" method="GET">
            <button type="submit" name="button" value="button2">GET Books LIST</button>
        </form>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
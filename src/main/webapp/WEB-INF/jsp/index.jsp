<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tic-tac-toe</title>
    <%--<link rel="stylesheet" href="style.css">--%>
    <style>
        body, html {
            background-color: antiquewhite;
            font-family: Arial;
            color: black;
        }

        .button {
            background: black;
            color: #fff;
            padding: 1rem 1rem;
            text-decoration: none;
            border-radius: 5px;
        }
    </style>
</head>
<body>
<h1>
    <fmt:message key="label.content"/>
</h1><br>
<a href="table" class="button"><fmt:message key="label.button"/></a><br>
<h3>
    <fmt:message key="label.changeLang"/>
</h3><br>
<ul>
    <li><a href="?lang=en_US"><fmt:message key="label.lang.en"/></a></li>
    <li><a href="?lang=fr_FR"><fmt:message key="label.lang.fr"/></a></li>
</ul><br>
</body>
</html>

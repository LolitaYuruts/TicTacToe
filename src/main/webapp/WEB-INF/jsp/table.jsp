<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Tic-tac-toe</title>
    <style type="text/css">
        body, html {
            background-color: antiquewhite;
            font-family: Arial;
            color: black;
        }

        table {
            border: 1px whitesmoke;
            width: 35%;
            height: 70%;
            cellpadding: 0;
            cellspacing: 0;
            margin: 75px auto;
        }

        th {
            color: whitesmoke;
            text-align: center;
            background: lightslategray;
        }
    </style>
</head>
<body>
<table>
    <c:forEach var="y" begin="0" end="2" step="1">
        <tr>
            <c:forEach var="x" begin="0" end="2" step="1">
                <th>
                            <c:choose>
                                <c:when test="${array[y][x] == null}">
                            <form action="action" method="post">
                                <input type="hidden" name="y" value="${y}">
                                <input type="hidden" name="x" value="${x}">
                                <p><input type="submit" value="Choose"></p>
                                </c:when>
                                <c:otherwise>
                                    <c:out value="${array[y][x]}"></c:out>
                                </c:otherwise>
                            </c:choose>
                    </form>
                </th>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
</body>
</html>
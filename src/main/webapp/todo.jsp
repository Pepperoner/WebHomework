<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TO DO List:)</title>
</head>
<body>

<div>
    <form action="servlet" method="POST">
        <p><label>Введите новую цель:<br>
            <input type="text" name="task" size="30" maxlength="255"></label></p>
        <p><input type="submit" value="Добавить"></p>
    </form>
</div>

<div>
    <form action="servlet" method="post">
        <p><label>Укажите номер цели для удаления<br>
            <input type="number" name="taskForDelete" size="30" maxlength="255"></label></p>
        <p><input type="submit" value="Удалить"></p>
    </form>
</div>

<div align="center">
    <table border="5" width="800" align="center" cellpadding="10">
        <tr align="center">
            <td><h1>TO DO List:</h1>
                <ol>
                    <c:forEach items="${goals}" var="goal">
                        <h3>
                            <li><c:out value="${goal}"/></li>
                        </h3>
                    </c:forEach>
                </ol>
            </td>
        </tr>
    </table>
</div>

</body>
</html>

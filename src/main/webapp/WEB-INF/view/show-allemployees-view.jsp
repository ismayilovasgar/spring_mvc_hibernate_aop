<%--
  Created by IntelliJ IDEA.
  User: ismayilovasgar
  Date: 21/10/2025
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Show All Employees Item</title>
</head>
<body>
<br>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th colspan="2">Operations</th>
    </tr>

    <c:forEach var="employee" items="${allEmployees}">
        <c:url var="updateButton" value="updateInfo">
            <c:param name="id" value="${employee.id}"/>
        </c:url>
        <c:url var="deleteButton" value="deleteEmployee">
            <c:param name="empId" value="${employee.id}"/>
        </c:url>
        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>
            <td>
                <input value="update" type="button"
                       onclick="window.location.href='${updateButton}'"/>
            </td>
            <td>
                <input value="delete" type="button"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>

</table>

<br>

<input type="button" value="add" onclick="window.location.href='addEmployee' "/>
</body>
</html>

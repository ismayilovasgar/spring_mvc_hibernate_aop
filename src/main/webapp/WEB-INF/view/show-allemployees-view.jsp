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
    </tr>

    <c:forEach var="employee" items="${allEmployees}">
        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>
        </tr>
    </c:forEach>

</table>

<br>

<input type="button" value="add" onclick="window.location.href='addEmployee' "/>
</body>
</html>

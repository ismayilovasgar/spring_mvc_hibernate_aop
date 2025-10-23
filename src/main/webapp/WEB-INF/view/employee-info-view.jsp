<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ismayilovasgar
  Date: 22/10/2025
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>employee info</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/style.css">

</head>
<body>

<h2>Add Employe Page</h2>
<form:form modelAttribute="employee" action="saveEmployee">
    <form:hidden path="id"/>
    Name: <form:input path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <br><br>
    Department: <form:input path="department"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <br><br>
    <input type="submit" value="Ok"/>
</form:form>

<script src="${pageContext.request.contextPath}/resources/static/js/script.js"></script>
</body>
</html>

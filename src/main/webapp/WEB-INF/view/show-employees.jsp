<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 2/13/22
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
    <h2>All employees</h2>
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
    <br/>
    <input type="button" value="Add"
        onclick="window.location.href='addNewEmployee'"/>
</body>
</html>

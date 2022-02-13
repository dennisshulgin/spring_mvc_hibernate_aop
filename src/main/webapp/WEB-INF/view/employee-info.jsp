<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: denis
  Date: 2/13/22
  Time: 12:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee info</title>
</head>
<body>
    <form:form action="saveEmployee" modelAttribute="employee">
        Name <form:input path="name"/>
        <br/>
        <form:errors path="name"/>
        <br/><br/>
        Surname <form:input path="surname"/>
        <br/>
        <form:errors path="surname"/>
        <br/><br/>
        Department <form:input path="department"/>
        <br/>
        <form:errors path="department"/>
        <br/><br/>
        Salary <form:input path="salary"/>
        <br/>
        <form:errors path="salary"/>
        <br/><br/>
        <input type="submit" value="OK">
    </form:form>
</body>
</html>

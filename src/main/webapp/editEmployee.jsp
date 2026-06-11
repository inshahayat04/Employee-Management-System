<%@ page import="com.ems.model.Employee" %>

<%

Employee emp =
(Employee)request.getAttribute("employee");

%>

<html>

<head>

<title>Edit Employee</title>

<style>

body{
    font-family:Arial;
    background:#f4f4f4;
}

.container{
    width:400px;
    margin:50px auto;
    background:white;
    padding:20px;
    border-radius:10px;
}

input{
    width:100%;
    padding:10px;
    margin-top:10px;
}

button{
    width:100%;
    padding:10px;
    background:#243b55;
    color:white;
    border:none;
    margin-top:15px;
}

</style>

</head>

<body>

<div class="container">

<h2>Edit Employee</h2>

<form action="updateEmployee" method="post">

<input type="hidden"
name="id"
value="<%= emp.getId() %>">

<input type="text"
name="name"
value="<%= emp.getName() %>">

<input type="email"
name="email"
value="<%= emp.getEmail() %>">

<input type="text"
name="department"
value="<%= emp.getDepartment() %>">

<input type="number"
name="salary"
value="<%= emp.getSalary() %>">

<button type="submit">
Update Employee
</button>

</form>

</div>

</body>
</html>
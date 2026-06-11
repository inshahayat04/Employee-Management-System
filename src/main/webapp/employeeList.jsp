<%@ page import="java.util.List" %>
<%@ page import="com.ems.model.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<style>

body{
    font-family:Arial;
    background:#f4f4f4;
    padding:20px;
}

h2{
    text-align:center;
}

table{
    width:100%;
    border-collapse:collapse;
    background:white;
}

table th, table td{
    border:1px solid #ccc;
    padding:12px;
    text-align:center;
}

table th{
    background:#243b55;
    color:white;
}

</style>

</head>

<body>

<h2>Employee Records</h2>

<table>

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Department</th>
    <th>Salary</th>
</tr>

<%

List<Employee> list =
(List<Employee>)request.getAttribute("employeeList");

for(Employee emp : list){

%>

<tr>

<td><%= emp.getId() %></td>
<td><%= emp.getName() %></td>
<td><%= emp.getEmail() %></td>
<td><%= emp.getDepartment() %></td>
<td><%= emp.getSalary() %></td>

</tr>

<%
}
%>

</table>

</body>
</html>
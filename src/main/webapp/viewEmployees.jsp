<%@ page import="java.util.*" %>
<%@ page import="com.ems.model.Employee" %>

<html>

<head>

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

a{
    text-decoration:none;
    font-weight:bold;
    margin:5px;
}

.edit{
    color:green;
}

.delete{
    color:red;
}

button{
    padding:10px;
    background:#243b55;
    color:white;
    border:none;
    cursor:pointer;
}

button:hover{
    background:#141e30;
}

</style>

</head>

<body>

<h2>Employee List</h2>

<br>

<a href="sortedEmployees">

<button>
Sort By Salary
</button>

</a>

<a href="dashboard">

<button>
Back To Dashboard
</button>

</a>

<br><br>

<table>

<tr>

<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Department</th>
<th>Salary</th>
<th>Action</th>

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

<td>

<a class="edit"
href="editEmployee?id=<%= emp.getId() %>">
Edit </a>

|

<a class="delete"
href="deleteEmployee?id=<%= emp.getId() %>">
Delete </a>

</td>

</tr>

<%
}
%>

</table>

</body>
</html>

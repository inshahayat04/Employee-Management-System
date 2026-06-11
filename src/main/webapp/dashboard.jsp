<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    margin:0;
    font-family:Arial;
}

.sidebar{
    width:250px;
    height:100vh;
    background:#0b1f3a;
    position:fixed;
    color:white;
}

.sidebar h3{
    text-align:center;
    padding:20px;
}

.sidebar a{
    display:block;
    color:white;
    text-decoration:none;
    padding:15px;
}

.sidebar a:hover{
    background:#1e3c72;
}

.main{
    margin-left:250px;
    padding:30px;
}

.card-box{
    padding:20px;
    border-radius:10px;
    color:white;
}

.blue{
    background:#0d6efd;
}

.green{
    background:#198754;
}

.orange{
    background:#ffc107;
    color:black;
}

</style>

</head>

<body>

<div class="sidebar">

<h3>EMS</h3>

<a href="dashboard">Dashboard</a>

<a href="index.jsp">Add Employee</a>

<a href="viewEmployees">Employee List</a>

<a href="login.jsp">Logout</a>

</div>

<div class="main">

<h2>Employee Management System</h2>

<br>

<div class="row">

<div class="col-md-4">
<div class="card-box blue">
<h4>Total Employees</h4>
<h2><%= request.getAttribute("totalEmployees") %></h2>
</div>
</div>

<div class="col-md-4">
<div class="card-box green">
<h4>Departments</h4>
<h2><%= request.getAttribute("departments") %></h2>
</div>
</div>

<div class="col-md-4">
<div class="card-box orange">
<h4>New Employees</h4>
<h2><%= request.getAttribute("newEmployees") %></h2>
</div>
</div>

</div>

<br><br>

<a href="index.jsp" class="btn btn-success">
Add Employee
</a>

<a href="viewEmployees" class="btn btn-primary">
View Employee List
</a>

<a href="login.jsp" class="btn btn-danger">
Logout
</a>

</div>

</body>
</html>

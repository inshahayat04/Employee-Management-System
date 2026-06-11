<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>

<style>

body{
    font-family: Arial;
    background: linear-gradient(to right,#141e30,#243b55);
    display:flex;
    justify-content:center;
    align-items:center;
    height:100vh;
}

.container{
    background:white;
    padding:30px;
    width:350px;
    border-radius:10px;
    box-shadow:0px 0px 15px rgba(0,0,0,0.3);
}

h2{
    text-align:center;
    margin-bottom:20px;
}

input{
    width:100%;
    padding:10px;
    margin-top:10px;
    border:1px solid #ccc;
    border-radius:5px;
}

button{
    width:100%;
    padding:12px;
    margin-top:15px;
    background:#243b55;
    color:white;
    border:none;
    border-radius:5px;
    font-size:16px;
    cursor:pointer;
}

button:hover{
    background:#141e30;
}

</style>

</head>

<body>

<div class="container">

<h2>Add Employee</h2>

<form action="addEmployee" method="post">

<input type="text" name="name" placeholder="Enter Name" required>

<input type="email" name="email" placeholder="Enter Email" required>

<input type="text" name="department" placeholder="Enter Department" required>

<input type="number" name="salary" placeholder="Enter Salary" required>

<button type="submit">Add Employee</button>

</form>

</div>

</body>
</html>
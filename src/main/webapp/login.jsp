<html>

<head>

<title>Login</title>

<style>

body{
    font-family:Arial;
    background:#243b55;
}

.container{
    width:350px;
    background:white;
    margin:100px auto;
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
    margin-top:15px;
    background:#243b55;
    color:white;
    border:none;
}

</style>

</head>

<body>

<div class="container">

<h2>Admin Login</h2>

<form action="login" method="post">

<input type="text"
name="username"
placeholder="Enter Username">

<input type="password"
name="password"
placeholder="Enter Password">

<button type="submit">
Login
</button>

</form>

</div>

</body>

</html>
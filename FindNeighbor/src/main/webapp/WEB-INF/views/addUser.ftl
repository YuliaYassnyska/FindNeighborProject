<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Add user</h1>
<form name="user" action="/addUser" method="post">
<#--    <p>Id</p>-->
<#--    <input title = "Id" type="text" name="id">-->
    <p>First Name</p>
    <input title = "First name" type="text" name="firstName">
    <p>Last Name</p>
    <input title = "Last name" type="text" name="lastName">
    <p>Email</p>
    <input title = "Email" type="text" name="email">
    <input type="submit" value="OK">
</form>
<p>
<a href="/users">Back To userList</a>
</p>
</body>
</html>
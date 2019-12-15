<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>User list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
    </tr>
    <#list users as user>
<tr>
    <td><a href="/user/${user.id}">${user.id}</td>
    <td>${user.firstName}</td>
    <td>${user.lastName}</td>
    <td>${user.email}</td>
    <td><a href="/delete/${user.id}">Delete</a></td>
    <td><a href="/update/${user.id}">Update</a></td>
</tr>
</#list>
</table>

<a href = "addUser">Add User </a>
</body>
</html>
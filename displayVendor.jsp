<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dispaly Vendor</title>
</head>
<body>
<h3>Vendor</h3>
<table>
<tr>
<th>id</th>
<th>code</th>
<th>name</th>
<th>type</th>
<th>email</th>
<th>phone</th>
<th>address</th>
</tr>
<c:forEach items="${vendor}" var="vendor">
<tr>
<td>${vendor.id}</td>
<td>${vendor.code}</td>
<td>${vendor.name}</td>
<td>${vendor.type}</td>
<td>${vendor.email}</td>
<td>${vendor.phone}</td>
<td>${vendor.address}</td>
<td><a href="showUpdate?id=${vendor.id}">Update</a></td>
<td><a href="deleteVendor?id=${vendor.id}">Delete</a></td>
</tr>
</c:forEach>

</table>

</body>
</html>
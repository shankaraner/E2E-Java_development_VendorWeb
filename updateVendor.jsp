<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Vendor</title>
</head>
<body>
<form action="updateVendor" method="post">
<pre>
id=<input type="text" name="id" value="${Vendor.id}" readonly>
code=<input type="text" name="code" value="${Vendor.code}" >
name=<input type="text" name="name" value="${Vendor.name}">
Type : Regular<input type="radio" name="type" value="Regular" ${Vendor.code == 'Regular'?'checked':''}/> 
	   Contract<input type="radio" name="type" value="Contract" ${Vendor.code == 'Contract'?'checked':''}/>
email=<input type="text" name="email" value="${Vendor.email}">
phone=<input type="text" name="phone" value="${Vendor.phone}">
address=<input type="text" name="address" value="${Vendor.address}">
 <input type="submit" value="Save" />
</pre>

</form>

</body>
</html>
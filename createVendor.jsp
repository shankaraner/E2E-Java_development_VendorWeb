<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>
<form action="saveVendor " method="post">
<pre>
id=<input type="text" name="id">
code=<input type="text" name="code">
name=<input type="text" name="name">
Type : Regular<input type="radio" name="type" value="Regular"/> 
		       Contract<input type="radio" name="type" value="Contract"/>
email=<input type="text" name="email">
phone=<input type="text" name="phone">
address=<input type="text" name="address">
 <input type="submit" value="Save" />
</pre>

</form>
${msg}
<a href="displayVendor">View All</a>
</body>
</html>
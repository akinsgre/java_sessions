<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
<META HTTP-EQUIV="CACHE-CONTROL" CONTENT="NO-CACHE, NO-STORE">

</head>
<body>
<h1>Test page</h1>

<p>I'm ${name}</p>
<p>My favorite color is ${color} </p>
<p>My session is ${sessionId}</p>
<form action="hello" method="POST">
Username <input name="name" id="name" type="text"/>
Color <input name="color" id="color" type="text"/>
<input type="submit" />
</form>


</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Test page</h1>
<p>I'm ${name}</p>
<p>My favorite color is ${color} </p>
<p>My session is ${sessionId}</p>
<form action="/hello" method="POST">
Username <input name="name" id="name" type="text"/>
Color <input name="color" id="color" type="text"/>
<input type="submit" />
</form>
<a href="/logout" >Logout</a>
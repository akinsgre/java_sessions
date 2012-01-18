<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Test page</h1>
<p>I'm ${name}</p>
<p>Current logged in user is <c:out value="${name}" /></p>
<form action="/hello">
Username <input type="text"/>
<input type="submit" />
</form>
<a href="/logout" >Logout</a>
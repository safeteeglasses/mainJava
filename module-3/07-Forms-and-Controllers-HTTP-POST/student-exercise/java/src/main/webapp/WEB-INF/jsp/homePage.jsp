<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
		<img src="etc/forDummies.png">
</head>
<c:forEach var="post" items="${reviews}">
	<table>
		<tr>
		<td>${post.title} ${post.username}</td>
		</tr>
		<p></p>
		<tr>
		<td>${post.dateSubmitted}</td>
		</tr>
		<tr>
		<td>${post.rating}</td>
		</tr>
		<p></p>
		<tr>
		<td>${post.text}</td>
		</tr>
	</table>
</c:forEach>
	<div><a href="reviewInput">Submit a review</a></div>

</html>

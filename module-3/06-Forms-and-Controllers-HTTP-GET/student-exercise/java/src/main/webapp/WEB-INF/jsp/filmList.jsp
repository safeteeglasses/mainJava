<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/filmList"/>
<form method="GET" action="${formAction}"> 
		<label for="maxLength">Maximum Length: </label>
			<input type="text" name="maxLength" id="maxLength"/>
		<label for="maxLength">Minimum Length: </label>
			<input type="text" name="minLength" id="minLength"/>	
			<select name="genre" id="genre">
			<forEach items="${films}" var="category">
				<option> ${category.genre}</option>
			</select>
			</forEach>	
			<input type="submit" value="Submit"/>
	
	</form>

<table class="table">
<tr>
<th>Title</th>
<th>Description</th>
<th>Release Year</th>
<th>Length</th>
<th>Rating</th>
</tr>

		<c:forEach items="${films}" var="film">
		
	<tr>
		
			<td>${film.title}</td>
			<td>${film.description}</td>
			<td>${film.releaseYear}</td>
			<td>${film.length}</td>
			<td>${film.rating}</td>
		</c:forEach>
	</tr>
</table>




<%@include file="common/footer.jspf"%>
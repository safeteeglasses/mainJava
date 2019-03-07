<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>
	
	
<c:url var="formAction" value="/filmList"/>
	<form method="GET" action="${formAction}"> 
		<label for="maxLength">Maximum Length:</label>
			<input type="text" placeholder="Max" name="maxLength" id="maxLength"/>
		<label for="maxLength">Minimum Length: </label>
			<input type="text" placeholder="Min" name="minLength" id="minLength"/>	
			<select name="genre" id="genre">
			<option value="Action">Action</option>
			<option value="Animation">Animation</option>
			<option value="Children">Children</option>
			<option value="Classics">Classics</option>
			<option value="Comedy">Comedy</option>
			<option value="Documentary">Documentary</option>
			<option value="Drama">Drama</option>
			<option value="Family">Family</option>
			<option value="Foreign">Foreign</option>
			<option value="Games">Games</option>
			<option value="Horror">Horror</option>
			<option value="Music">Music</option>
			<option value="New">New</option>
			<option value="Sci-Fi">Sci-Fi</option>
			<option value="Sports">Sports</option>
			<option value="Travel">Travel</option>
			<option value="Mathmagical">Mathmagical</option>
			</select>
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
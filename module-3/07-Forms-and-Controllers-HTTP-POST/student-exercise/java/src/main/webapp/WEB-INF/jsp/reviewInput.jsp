<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
</head>

<img src="etc/forDummies.png"/>


<c:url value="homePage" var="formAction"/>
<form method="POST" action="${formAction}">

	<div class="formInputGroup">
		<label for="username">Username</label> 
		<input type="text" name="username" id="username" />
	</div>
	
	<div class="formInputGroup">
		<label for="rating">Rating</label> 
		<input type="text" name="rating" id="rating" />
	</div>
	
	<div class="formInputGroup">
		<label for="title">Title</label> 
		<input type="text" name="title" id="title" />
	</div>
	
	<div class="formInputGroup">
		<label for="text">Review</label> 
		<textarea cols="25" rows="5" name="text" id="text">
		</textarea>
	</div>
	
	<input class="formSubmitButton" type="submit" value="Submit" />
	
</form>
<a href="homePage">Back to home page</a>
</div>

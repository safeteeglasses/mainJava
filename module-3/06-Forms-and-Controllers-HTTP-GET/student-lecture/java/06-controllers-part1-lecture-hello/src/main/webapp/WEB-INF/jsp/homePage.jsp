<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Hello Spring MVC</title>
	</head>
	<body>
		<c:url value="/greeting" var="formAction" />			<!-- Define an always correct URL to use -->
		<form method="GET" action="${formAction}">				<!-- Define a form  -->
			<label for="theName">Your Name: </label>            <!-- Label is text to appear on the page -->
			<input type="text" id="theName" name="name" />		<!-- Define a text input box called theName -->
																<!-- associate the label theName with this textbox -->
																<!-- store any data in the variable called name -->
			<input type="submit" value="Get Greeting" />		<!-- define a submit button -->
		</form>													<!-- any form variables are added to query string -->					
	</body>														<!-- on submit -->
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
		<c:set var="num1" value="0" />
			<c:set var="num2" value="1"/>
			<c:set var="num3" value="0"/>
			
			<c:forEach begin="1" end="25" var="numbers">
			<li>${num1}</li>
			<c:set var="num1" value="${num2}"/>
			<c:set var="num2" value="${num2 + num3}"/>
			<c:set var="num3" value="${num1}"/>
 			</c:forEach>
			
			
			
			
		
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
		</ul>
	</body>
</html>
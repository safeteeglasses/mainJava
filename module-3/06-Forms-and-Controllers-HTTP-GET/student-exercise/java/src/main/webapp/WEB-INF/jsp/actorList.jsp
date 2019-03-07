<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
	


<c:url var="formAction" value="/actorList" />
<form method="GET" action="${formAction}"> <!--  on submit we want to run the result.jsp -->
	<div class="formInputGroup">
		<label for="actorList"></label> 
		<input type="text" placeholder="Last name" name="name" id="actorList" />
		
		<input type="submit" value="Submit"/>
	</div>
	</form>
	
	
	
<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
		<td>${actor.firstName} ${actor.lastName}</td>
		
    <!-- What do we print here for each actor? -->
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>
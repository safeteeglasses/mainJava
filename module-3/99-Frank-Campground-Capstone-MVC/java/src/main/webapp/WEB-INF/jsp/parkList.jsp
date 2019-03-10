<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="pageTitle" value="Park List"/>
	</c:import>
	
	
	<div id="welcomeMsg">
	Check out this list of parks!
	</div>
<ul>
	<c:forEach var="park" items="${parks}"> <!-- iterate through the ModelMap parks sent from controller --> 
		<li>${park.name}</li>
	</c:forEach>
</ul>
<c:import url="/WEB-INF/jsp/common/footer.jsp"/>
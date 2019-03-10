<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

	<c:import url="/WEB-INF/jsp/common/header.jsp">
	    <c:param name="pageTitle" value="Campground Reservation Home Page" />
	</c:import>
<div id="welcomeMsg">
	Welcome to Our Campground Reservation System
</div>

<div id="chooser">
<c:url var="parkListURL" value="/parkList"/>

   	<a href="${parkListURL}">List Parks</a>
</div>
	
<c:import url="/WEB-INF/jsp/common/footer.jsp" />

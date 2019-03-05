<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Films List"/>

<%@include file="common/header.jspf"%>

<c:url var="formAction" value="/filmList"/>
<form method="GET" action="${formAction}"> 
	<div class="formInputGroup">
		<label for="maxLength">Maximum Length: </label>
			<input type="text" name="maxLength" id="maxLength"/>	
</div>
</form>








<%@include file="common/footer.jspf"%>
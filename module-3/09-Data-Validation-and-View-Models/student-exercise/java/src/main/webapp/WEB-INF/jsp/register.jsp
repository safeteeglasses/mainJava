<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="common/header.jspf" %>

<h1>New User Registration</h1>


<section id="main-content"  class="centeredPanel">
<c:url value="/register" var="registrationUrl"/>
<form:form action="${registrationUrl}" method="POST" modelAttribute="Registration">

	 	<div>
        	<label for="firstName">First Name *</label>
        	<form:input  path="firstName"  class="form-control"/>
        	<form:errors path="firstName"  cssClass="error"/>
       </div>
     
    	
    	
    	<div>
        	<label for="lastName">Last Name *</label>
        	<form:input  path="lastName"  class="form-control"/>
        	<form:errors path="lastName"  cssClass="error"/>
        </div>
        
		
		
		<div>
            <label for="email">Email *</label>
			<form:input  path="email" class="form-control"/>            
        	<form:errors path="email" cssClass="error"/>
        	<form:errors path="emailMatching" cssClass="error"/>
        </div>
        
        
        
        <div>
            <label for="verifyEmail">Confirm Email *</label>
            <form:input  path="verifyEmail" class="form-control"/>
            <form:errors path="verifyEmail" cssClass="error"/>
        </div>
        
       
       
        <div>
        	<label for="password">Password *</label>
        	<form:input type="password"  path="password" class="form-control"/>
        	<form:errors path="password"  cssClass="error"/>
        	<form:errors path="passwordMatching" cssClass="error"/>
        		
    	</div>
        
        <div>
            <label for="verifyPassword">Confirm Password *</label>
            <form:input type="password" path="verifyPassword" class="form-control"/>
            <form:errors path="verifyPassword" cssClass="error"/>
        </div>
        
        <div>
            <label for="birthday">Birthday YYYY-MM-DD *</label>
            <form:input  path="birthday" class="form-control"/>
            <form:errors path="birthday" cssClass="error"/>   
        </div>
        
        <div>
            <label for="tickets"># of tickets *</label>
            <form:input  path="tickets" class="form-control"/>
            <form:errors path="tickets" cssClass="error"/>    
        </div>
        
        <div>
            <input type="submit" value="Submit"/>
        </div>
     
</form:form>
</section>









<%@include file="common/footer.jspf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<%@include file="common/header.jspf" %>
<section id="main-content"  class="centeredPanel">
<c:url value="/mailingList" var="mailingListSignUpUrl" /> 
 
 <!-- modelAttribute= Use this model automatically with the form -->
<form:form action="${mailingListSignUpUrl}"       <%-- action= Use this URL on submit --%> 
           method="POST"                          <%-- method= issue a POST on submit --%>
           modelAttribute="SignUp">               <%-- method= issue a POST on submit --%>
		<!-- form:errors path="*" cssClass="error"/ -->
        <div>
        	<label for="name">Name</label>
        	<form:input  path="name"  class="form-control"/><!-- name= identify the variable in the model backing form         -->
        	                                                <!-- class="form-control" - it's a text box (instead of type=text) -->
        	<form:errors path="name"  cssClass="error"/>    <!-- Put any error message here                                    -->
        		                                            <!-- cssClass attribute IS the name for the error indicator        -->
        </div>
        <div>
            <label for="email">Email</label>
			<form:input  path="email" />            
        	<form:errors path="email" cssClass="error"/>
        	<form:errors path="emailMatching" cssClass="error"/>
        </div>

        <div>
            <label for="verifyEmail">Verify Email</label>
            <form:input  path="verifyEmail" />
            <form:errors path="verifyEmail" cssClass="error"/>
        </div>

        <div>
            <label for="phone">Phone Number (XXX)XXX-XXXX</label>
            <form:input  path="phone" />
            <form:errors path="phone" cssClass="error"/>            
        </div>
        
        <div>
            <label for="occupation">Occupation</label>
            <form:input  path="occupation" />
            <form:errors path="occupation" cssClass="error"/>   
        </div>
        
        <div>
            <label for="age">Age</label>
            <form:input  path="age" />
            <form:errors path="age" cssClass="error"/>    
        </div>
        
        <div>
            <input type="submit" value="Sign Me Up!"/>
        </div>
</form:form>
</section>
<%@include file="common/footer.jspf" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="common/header.jspf" %>
<h1>Login</h1>


<section id="main-content"  class="centeredPanel">
<c:url value="/login" var="loginUrl"/>
<form:form action="${loginUrl}" method="POST" modelAttribute="Login">

		<div>
            <label for="email">Email *</label>
            <form:input  path="email" class="form-control"/>
            <form:errors path="email" cssClass="error"/>
        </div>
        
         <div>
            <label for="password">Password *</label>
            <form:input type="password" path="password" class="form-control"/>
            <form:errors path="password" cssClass="error"/>
        </div>
        
        <div>
            <input type="submit" value="Submit"/>
        </div>
     
</form:form>
        
</section>




<%@include file="common/footer.jspf" %>
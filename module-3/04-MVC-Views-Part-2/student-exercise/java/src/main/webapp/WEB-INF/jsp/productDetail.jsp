<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp"/>
	<section>

	<c:forEach var="name" items="${product}">
		<li>${name.productList}</li>
	</c:forEach>
	</section>
</body>
</html>
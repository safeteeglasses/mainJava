<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp"/>
	<section id="main-content-detail">
	
		
		<img id="detail-image" src="img/${product.imageName}"/>
		<div><span style="font-size: 30px">${product.name}</span><c:if test="${product.topSeller == true}"><span style="color: red"> BEST SELLER!</span></c:if></div>
		<div>by ${product.getManufacturer()}</div>
		<img id="star" src="img/${Math.round(product.averageRating)}-star.png">
		<p>
		<div class="price">Price: $${product.price}</div>
		<div><span style="font-weight: bold">Weight </span>${Math.round(product.weightInLbs)} lbs</div>
		<p>
		<div id="description"> description: ${product.description}</div>
	</section>
</body>
</html>
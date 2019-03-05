<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url="/WEB-INF/jsp/header.jsp"/>

<c:set var="count" value="0"></c:set>
<h1>Toy Department</h1>
    <section id="main-content">
    	
			<c:forEach var="name" items="${productList}">
			<c:url var="url"
    			value="productDetail?productId=${name.getProductId()}"/>
    		<li><a href="${url}"><img id="toy-list" src="img/${name.imageName}"></a></li>
			
			
			
    		
    		<!--<c:set var="count" value="${count + 1}"></c:set>-->
    		<li><span style="font-size: 24px">${name.name}</span><c:if test="${name.topSeller == true}"><span style="color: red"> BEST SELLER!</span></c:if></li>
    		<li>by ${name.manufacturer}</li>
    		<li class="price">$${name.price}</li>
    		<li><span style="font-weight: bold">Weight </span>${Math.round(name.weightInLbs)} lbs</li>
    		<li><img id="star" src="img/${Math.round(name.averageRating)}-star.png"></li>
			</c:forEach>
		
     </section>
</body>
</html>
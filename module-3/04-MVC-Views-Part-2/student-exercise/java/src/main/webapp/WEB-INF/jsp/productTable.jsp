<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="/WEB-INF/jsp/header.jsp"/>

<h1>Toy Department</h1>
    <section id="main-content-table">
    	<table>
    		
			<tr>
			<th></th>
			<c:forEach var="picture" items="${productList}">
			<c:url var="url"
    			value="productDetail?productId=${picture.productId}"/>
    		<td><a href="${url}"><img id="toy" src="img/${picture.imageName}"></a></td>
			</c:forEach>
			</tr>
			
			<tr>
			<th></th>
			<c:forEach var="bestSeller" items="${productList}">
			<td><c:if test="${bestSeller.topSeller == true}"><span style="color: red"> BEST SELLER!</span></c:if></td>
			</c:forEach>
			</tr>
			
			<tr>
			<th>Name</th>
			<c:forEach var="name" items="${productList}">
			<td class="grey-background">${name.name}</td>
			</c:forEach>
			</tr>
			
			<tr>
			<th>Rating</th>
			<c:forEach var="rating" items="${productList}">
			<td><img id="star-rating" src="img/${Math.round(rating.averageRating)}-star.png"></td>
			</c:forEach>
			</tr>
			
			<tr>
			<th>Mfr</th>
			<c:forEach var="manufacturer" items="${productList}">
			<td class="grey-background">${manufacturer.manufacturer}</td>
			</c:forEach>
			</tr>
			
			<tr>
			<th>Price</th>
			<c:forEach var="price" items="${productList}">
			<td><span style="color: #a52a2a"> $${price.price}</span></td>
			</c:forEach>
			</tr>
			
			<tr>
			<th>Wt. (in lbs)</th>
			<c:forEach var="weight" items="${productList}">
			<td class="grey-background">${Math.round(weight.weightInLbs)}</td>
			</c:forEach>
			</tr>
			
			
			
			<%-- <c:forEach var="name" items="${productList}">
				<tr>
				<th>Name</th>
    			<td><img id="toy" src="img/${name.imageName}"></td></tr>
    			<tr>
    			<td>${name.name}<c:if test="${name.topSeller == true}"><span style="color: red"> BEST SELLER!</span></c:if></td></tr>
    			<tr>
    			<td>by ${name.manufacturer}</td></tr>
    			<tr>
    			<td class="price">$${name.price}</td></tr>
    			<tr>
    			<td><span style="font-weight: bold">Weight </span>${Math.round(name.weightInLbs)} lbs</td></tr>
    			<tr>
    			<td><img id="star" src="img/${Math.round(name.averageRating)}-star.png"></td></tr>
			</c:forEach> --%>
		</table>
    </section> 
</body>
</html>
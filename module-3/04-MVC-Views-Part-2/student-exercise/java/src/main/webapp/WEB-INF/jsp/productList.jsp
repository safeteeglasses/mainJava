<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product List View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul>
            
            <li><a href="#">Tile Layout</a></li>
            <li><a href="#">Table Layout</a></li>
        </ul>
        
    </nav>
    <section id="main-content">
    	<h1>Toy Department</h1>
    
    	<c:forEach var="name" items="${productList}">
    		<li><img src="img/${name.getImageName()}"></li>
    		<li>${name.name}</li>
    		<li>by ${name.manufacturer}</li>
    		<li>${name.price}</li>
    		<li>${name.weightInLbs}</li>
    		<li>${name.averageRating}</li>
		</c:forEach>
       

    </section>
</body>
</html>
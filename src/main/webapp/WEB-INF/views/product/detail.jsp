<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

 <div class="container-wrapper">
	<div class="container">
		<div class="jumbotron">
			<h1> Product Detail</h1>
			<p class="lead"> Here is the detail information! </p>
		</div>	
		
		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<c:choose>
						<c:when test="${not empty product.image }">
							<img src="<c:url value='/product/image/${product.id }'/>" alt="image" style="witdh: 100%; height: 300px"/>
						</c:when>
						<c:when test="${empty product.image }">
							<img src="<c:url value="/resources/images/mockup.jpg" /> " alt="image" style="witdh: 100%; height: 300px"/>
						</c:when>
					</c:choose>
				</div>
				<div class="col-md-5">
					<h3> ${product.name } </h3>
					<p> ${product.description } </p>
					<p> 
						<strong> Manufacturer:  </strong> ${product.manufacturer } 
					</p>
					<p> 
						<strong> Category:  </strong> ${product.category.text } 
					</p>
					<p> 
						<strong> Condition:  </strong> ${product.condition.text } 
					</p>
					<p> 
						<strong> Size:  </strong> ${product.size.text } 
					</p>
					<h4> ${product.price } USD</h4>
					<c:if test="${pageContext.request.userPrincipal.name  != 'admin'}">
						<a href="#" class="btn btn-warning"> Add to cart 
		            		<i class="glyphicon glyphicon-shopping-cart"></i>	
						</a>
					    <input type="number" min="1" name="quantity" id="quantity" class="item-quantity" value="1"/>
					</c:if>
				</div>
			</div>
		</div>
	<a class="btn btn-default" href="<c:url value="javascript:history.back()" />" > Back </a> 
			
<%@ include file="/WEB-INF/views/template/footer.jsp" %>

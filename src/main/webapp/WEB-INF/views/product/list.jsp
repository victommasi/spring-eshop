<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="jumbotron">
					<h1> All Products</h1>
					<p class="lead"> Checkout all the awesome products available now! </p>
			</div>	
		
		<table class="table table-responsive table-striped table-hover hand-cursor table-hoverplus">
			<thead>
				<tr class="bg-primary">
					<th>Photo</th>
					<th>Name</th>
					<th>Category</th>
					<th>Size</th>
					<th>Condition</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody data-link="row" class="rowlink">
				<c:forEach items="${products }" var="product">
				<tr>
					<td>
					<a href="<spring:url value="/product/${product.id }"/> ">
						<c:choose>
							<c:when test="${not empty product.image }">
								<img src="<c:url value='/product/image/${product.id}'/>" alt="image" style="witdh: 100%; height: 80px"/>
							</c:when>
							<c:when test="${empty product.image  }">
								<img src="<c:url value="/resources/images/mockup.jpg" /> " alt="image" style="witdh: 100%; height: 80px"/>
							</c:when>
						</c:choose>
					</a>
					</td>
					<td class="col-md-3">${product.name}</td>
					<td class="col-md-2">${product.category.text}</td>
					<td class="col-md-1">${product.size.text}</td>
					<td class="col-md-1">${product.condition.text}</td>
					<td class="col-md-2">${product.price} USD</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>

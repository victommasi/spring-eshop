<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="jumbotron">
					<h1> Product Inventory </h1>
					<p class="lead"> Manage the products </p>
			</div>	
		
		
		<table class="table table-striped table-hover hand-cursor table-hoverplus">
			<thead>
				<tr class="bg-primary">
					<th>Photo</th>
					<th>Name</th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
				</tr>
			</thead>
			<tbody data-link="row" class="rowlink">
				<c:forEach items="${products }" var="product">
				<tr>
					<td><a href="<spring:url value="/product/${product.id }"/> "><img src="#" alt="image"/></a></td>
					<td>${product.name}</td>
					<td>${product.category.text}</td>
					<td>${product.condition.text}</td>
					<td>${product.price} USD</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a class="btn btn-primary" href="<spring:url value="/product/addProduct" />"> Add Product </a>
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>

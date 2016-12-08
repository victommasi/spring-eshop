<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="page-header">
				<h1> All Products</h1>
				<p class="lead"> Checkout all the awesome products available now! </p>
			</div>	
		
		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-primary">
					<th>Photo</th>
					<th>Name</th>
					<th>Category</th>
					<th>Condition</th>
					<th>Price</th>
				</tr>
			</thead>
				<c:forEach items="${products }" var="product">
				<tr>
					<td><img src="#" alt="image"/></td>
					<td><c:out value="${product.name}"/> </td>
					<td>${product.category.description}</td>
					<td>${product.condition.description}</td>
					<td>${product.price} USD</td>
				</tr>
				</c:forEach>
		</table>
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>

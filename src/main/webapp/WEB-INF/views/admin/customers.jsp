<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="jumbotron">
					<h1> Customers </h1>
					<p class="lead"> Manage the registered customers </p>
			</div>	
		
		
		<table class="table table-striped table-hover hand-cursor table-hoverplus">
			<thead>
				<tr class="bg-primary">
					<th>Name</th>
					<th>Email</th>
					<th>Phone</th>
					<th>Sex</th>
					<th>Age</th>
					<th></th>
				</tr>
			</thead>
			<tbody data-link="row" class="rowlink">
				<c:forEach items="${customers }" var="customer">
				<tr>
					<td><a href="<spring:url value="/product/${product.id }"/> "><img src="#" alt="image"/></a></td>
					<td>${customer.name}</td>
					<td>${customer.email}</td>
					<td>${customer.sex}</td>
					<td>${customer.age}</td>
					<td>${customer.phone} </td>
					<td ><a style="font-size:1.5em;" class="glyphicon glyphicon-edit" href="<spring:url value="/product/addProduct/${product.id }"/>"></a>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a class="btn btn-primary" href="<spring:url value="/customer/new" />"> Add Customer </a>
		<a class="btn btn-default" href="<spring:url value="/admin" />"> Return </a>
		
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>

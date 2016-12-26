<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="jumbotron">
					<h1> Product Inventory </h1>
					<p class="lead"> Manage the products </p>
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
					<th></th>
				</tr>
			</thead>
			<tbody data-link="row" class="rowlink">
				<c:forEach items="${products }" var="product">
				<tr>
					<td>
						<a href="<spring:url value="/product/${product.id }"/> ">
						<c:choose>
							<c:when test="${not empty product.image }">
								<img src="<c:url value='/product/image/${product.id}'/>" alt="image" style="witdh: 100%; height: 40px"/>
							</c:when>
							<c:when test="${empty product.image  }">
								<img src="<c:url value="/resources/images/mockup.jpg" /> " alt="image" style="witdh: 100%; height: 50px"/>
							</c:when>
						</c:choose>
						</a>
					</td>
					<td class="col-md-3">${product.name}</td>
					<td class="col-md-2">${product.category.text}</td>
					<td class="col-md-1">${product.size.text}</td>
					<td class="col-md-1">${product.condition.text}</td>
					<td class="col-md-2">${product.price} USD</td>
					<td class="col-md-1"> 
						 <a style="font-size:1.2em;" title="Edit Product" class="glyphicon glyphicon-edit" 
					      href="<spring:url value="/admin/product/edit/${product.id }"/>">
					     </a>
					     <a style="font-size:1.2em; color:#c9302c;" title="Delete Product" class="glyphicon glyphicon-trash" 
					      href="<spring:url value="/admin/product/delete/${product.id }"/>">
					     </a>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<a class="btn btn-primary" href="<spring:url value="/admin/product/new" />"> Add Product </a>
		<a class="btn btn-default" href="<spring:url value="/admin" />"> Return </a>
		
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>

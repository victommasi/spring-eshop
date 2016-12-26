<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="jumbotron">
					<h1> Admin Page</h1>
					<p class="lead"> System management </p>
			</div>	
			
			<div class="">
					<a class="btn btn-default btn-lg btn-block" 
						href="<c:url value="/admin/products"/>"> 
						<h3> Product Inventory </h3>
						<section class="visible-lg-block">
							<p> Here you can view, check and modify the product inventory</p>
						</section>
					</a>
					<a class="btn btn-default btn-lg btn-block" 
						href="<c:url value="/admin/customers"/>"> 
						<h3> Customer Management </h3>
						<section class="visible-lg-block">
							<p> Here you can view the customer information</p>
						</section>
					</a>
			</div>

		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>
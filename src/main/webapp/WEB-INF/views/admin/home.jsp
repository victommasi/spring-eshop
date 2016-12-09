<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			<div class="jumbotron">
					<h1> Admin Page</h1>
					<p class="lead"> System management </p>
			</div>	
			
			<h3>
				<a href="<c:url value="/admin/inventory"/>"> Product Inventory </a>
			</h3>
			
			<p> Here you can view, check and modify the product inventory</p>
		
		
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>
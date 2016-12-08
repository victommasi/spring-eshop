<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
				<img src="" alt="image" style="witdh: 100%; height: 300px"/>
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
				<h4> ${product.price } USD</h4>
			</div>
		</div>
	</div>
			
<%@ include file="/WEB-INF/views/template/footer.jsp" %>

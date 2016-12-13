<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

 <div class="container-wrapper">
	<div class="container">
		<div class="jumbotron">
			<h1> Edit Product </h1>
			<p class="lead"> Fill the information below to edit product: </p>		
		</div>	
	
		<div class="container-fluid">
	       <form:form method="PUT" action="<c:url value="/${product.id }" />" commandName="product" enctype="multipart/form-data">
	       
		        <div class="row">
		       	  	<div class="col-sm-4 form-group">
			            <label for="name">Name</label> <form:errors path="name" cssStyle="color: #ff0000;" />
			            <form:input path="name" id="name" class="form-control"/>
		        	</div>
		        </div>
		
		        <div class="row">
		         	<div class="col-sm-4 form-group">
			            <label for="category">Category</label>
			            <form:select path="category" id="category" class="form-control">
			            	<form:option value=""> Select category </form:option>
							<form:options items="${category.text }"></form:options>
						</form:select> 
		        	</div>
		        </div>
		
				<div class="row">
			        <div class="col-sm-4 form-group">
			            <label for="description">Description</label>
			            <form:textarea path="description" id="description" class="form-control"/>
			        </div>
		        </div>	
		
		        <div class="row">
		         	<div class="col-sm-4 form-group">
			            <label for="condition">Condition</label>
			            <form:select path="condition" id="condition" class="form-control">
			            	<form:option value=""> Select condition </form:option>
							<form:options items="${condition.text }"></form:options>
						</form:select> 
		        	</div>
		        </div>
		
				<div class="row">
			        <div class="col-sm-4 form-group">
			            <label for="stock">Units in stock</label> 
			            <form:input path="stock" id="stock" class="form-control" value=""/>
			        </div>
			    </div>
		
				<div class="row">
			        <div class="col-sm-4 form-group">
			            <label for="manufacturer">Manufacturer</label>
			            <form:input path="manufacturer" id="manufacturer" class="form-control"/>
			        </div>
			    </div>
			    
			    <div class="row">
		         	<div class="col-sm-4 form-group">
			            <label for="size">Size</label>
			            <form:select path="size" id="size" class="form-control">
			            	<form:option value=""> Select size </form:option>
							<form:options items="${size.text }"></form:options>
						</form:select> 
		        	</div>
		        </div>
		        
		        <div class="row">
			        <div class="col-sm-3 form-group">
			            <label for="price">Price</label>  <form:errors path="price" cssStyle="color: #ff0000;" />
			            <div class="input-group">
				            <span class="input-group-addon">$</span>
				            <form:input type="text" path="price" id="price" class="form-control js-currency"/>
			        	</div>
			        </div>
		        </div>
		
		        <br><br>
		        <input type="submit" value="Submit" class="btn btn-primary">
		        <a href="<c:url value="/admin/inventory" />" class="btn btn-default">Cancel</a>
	        </form:form>
        </div>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>

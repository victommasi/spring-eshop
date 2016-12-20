<%@ include file="/WEB-INF/views/template/header.jsp" %>

 <div class="container-wrapper">
	<div class="container">
		<div class="jumbotron">
			<h1> Add Product </h1>
			<p class="lead"> Fill the information below to add a new product: </p>		
		</div>	
	
		<div class="container-fluid">
		
			<c:if test="${not empty message }">
				<div class="alert  alert-success  alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert" ><span aria-hidden="true">&times;</span></button>
						<span>${message}</span>
				</div>
			</c:if>
		
		   <spring:url value="/admin/product/new" var="addProductUrl" />
	       <form:form method="POST" action="${addProductUrl}" modelAttribute="product" enctype="multipart/form-data">
		        
		        <!--  
		        <div class="alert  alert-danger  alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
					<block each="error : ${fields.detailedErrors()}">
						<div>
							<i class="glyphicon glyphicon-exclamation-sign"></i> 
							<span text="${error.message}">This product already exists.</span>
						</div>
					</block>
				</div>
				-->
				 
		        
		        <div class="row">
		       	  	<div class="col-sm-6 form-group">
			            <label for="name">Name</label> <form:errors path="name" cssStyle="color: #c9302c;" />
			            <form:input path="name" id="name" class="form-control"/>
		        	</div>
		
					<div class="col-sm-6 form-group">
			            <label for="condition">Condition</label> <form:errors path="condition" cssStyle="color: #c9302c;" />
						    <div class="input-group col-lg-12">
						      <span class="input-group-addon">
						      	<form:radiobutton path="condition" name="condition" value="NEW"></form:radiobutton>
						      </span>
						      <label class="form-control"> New </label>
						      <span class="input-group-addon">
						        <form:radiobutton path="condition" name="condition" value="USED"></form:radiobutton>
						      </span>
						      <label class="form-control"> Used </label>
						    </div><!-- /input-group -->
			            
			            <!--<form:select path="condition" id="condition" class="form-control">
			            	<form:option value=""> Select Condition </form:option>
							<form:options items="${condition }" itemLabel="text"></form:options>
						</form:select> -->
		        	</div>
		        </div>
		
				<div class="row">
			        <div class="col-sm-6 form-group">
			            <label for="description">Description</label> <form:errors path="description" cssStyle="color: #c9302c;" />
			            <form:textarea path="description" id="description" class="form-control" rows="3"/>
			        </div>
		
					<div class="col-sm-3 form-group">
			            <label for="stock">Units in stock</label> <form:errors path="stock" cssStyle="color: #c9302c;" />
			            <form:input type="number" min="0" path="stock" id="stock" class="form-control" value=""/>
			        </div>
		        </div>
		
				<div class="row">
			        <div class="col-sm-6 form-group">
			            <label for="category">Category</label> <form:errors path="category" cssStyle="color: #c9302c;" />
			            <form:select path="category" id="category" class="form-control">
			            	<form:option value=""> Select Category </form:option>
							<form:options items="${category }" itemLabel="text"></form:options>
						</form:select> 
		        	</div>
		
			          <div class="col-sm-6 form-group">
			            <label for="price">Price</label>  <form:errors path="price" cssStyle="color: #c9302c;" />
			            <div class="input-group">
				            <span class="input-group-addon">$</span>
				            <form:input type="text" path="price" id="price" class="form-control"/>
			        	</div>
			        </div>
			    </div>
			    
			    <div class="row">
		         	<div class="col-sm-6 form-group">
			            <label for="size">Size</label> <form:errors path="size" cssStyle="color: #c9302c;" />
			            <form:select path="size" id="size" class="form-control">
			            	<form:option value=""> Select Size </form:option>
							<form:options items="${size }" itemLabel="text"></form:options>
						</form:select> 
		        	</div>
		        
			        <div class="col-sm-6 form-group">
			            <label class="control-label" for="image"> Upload image</label>  <form:errors path="" cssStyle="color: #c9302c;" />
			            <div class="input-group">
				            <form:input type="file" accept="image/jpg, image/png, image/jpeg" path="image" id="image" class="filestyle" data-icon="false"/>
			        	</div>
			        </div>
		        </div>
		        
		        <div class="row">
		        	 <div class="col-sm-6 form-group">
			            <label for="manufacturer">Manufacturer</label> <form:errors path="manufacturer" cssStyle="color: #c9302c;" />
			            <form:input path="manufacturer" id="manufacturer" class="form-control"/>
			        </div>
			      

					<div class="col-sm-6">
						<div class="pull-right">
			        		<input type="submit" value="Submit" class="btn btn-primary">
			        		<a href="<c:url value="/admin/productInventory" />" class="btn btn-default">Cancel</a>
			    		</div>
			    	</div>
			    </div>
		        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	        </form:form>
        </div>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>

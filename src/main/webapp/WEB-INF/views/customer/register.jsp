<%@ include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">
	<div class="container">
		<div class="jumbotron">
			<h1> Customer Registration </h1>
			<p class="lead"> Fill the information below to register: </p>		
		</div>	
	
		<div class="container-fluid">
		
			<c:if test="${not empty message }">
				<div class="alert  alert-success  alert-dismissible" role="alert">
						<button type="button" class="close" data-dismiss="alert" ><span aria-hidden="true">&times;</span></button>
						<span>${message}</span>
				</div>
			</c:if>
		
		   <spring:url value="/customer/register" var="registerUrl" />
	       <form:form method="POST" action="${registerUrl}" modelAttribute="customer">
		        
		        <div class="row">
		       	  	<div class="col-sm-6 form-group">
			            <label for="name">Name</label> <form:errors path="name" cssStyle="color: #c9302c;" />
			            <form:input path="name" id="name" class="form-control"/>
		        	</div>
		        	
		        	<div class="col-sm-3 form-group pull-right address-panel">
		        		<label for="streetName">Street Name</label> <form:errors path="address.streetName" cssStyle="color: #c9302c;" />
			            <form:input path="address.streetName" id="streetName" class="form-control"/>
			        </div>
		        </div>
		        <div class="row">
			         <div class="col-sm-6 form-group">
			            <label for="username">Username</label> <form:errors path="username" cssStyle="color: #c9302c;" />
			            <form:input path="username" id="username" class="form-control"/>
		        	</div>
			            
					<div class="col-sm-3 form-group pull-right address-panel">
		        		<label for="streetNumber">Street Number</label> <form:errors path="address.streetNumber" cssStyle="color: #c9302c;" />
			            <form:input path="address.streetNumber" id="streetNumber" class="form-control"/>
			        </div>
		        </div>
		
				<div class="row">
					<div class="col-sm-6 form-group">
			            <label for="password">Password</label> <form:errors path="password" cssStyle="color: #c9302c;" />
			            <form:input type="password" path="password" id="password" class="form-control"/>
		        	</div>
		
					<!-- <div class="col-sm-3 form-group pull-right address-panel">
		        		<label for="country">Country</label> <form:errors path="address.country" cssStyle="color: #c9302c;" />
			            <form:input path="address.country" id="country" class="form-control"/>
			        </div>
			        -->
		        </div>
		       
		        <div class="row">
					<div class="col-sm-6 form-group">
			            <label for="phone">Phone</label> <form:errors path="phone" cssStyle="color: #c9302c;" />
			            
			            <div class="input-group">
				        	<span class="input-group-addon">
				        		<i class="glyphicon glyphicon-earphone"></i>
				        	</span>			            
			            <form:input path="phone" id="phone" class="form-control"/>
			            </div>
		        	</div>
		        	
		        	<div class="col-sm-3 form-group pull-right address-panel">
		        		<label for="state">State</label> <form:errors path="address.state" cssStyle="color: #c9302c;" />
			            <form:select path="address.state" id="states" class="form-control">
			            </form:select>
			        </div>
		        </div>
		
				<div class="row">
			        <div class="col-sm-6 form-group">
			            <label for="email">Email</label> <form:errors path="email" cssStyle="color: #c9302c;" />
			            <div class="input-group">
				        	<span class="input-group-addon">
				        		<i class="glyphicon glyphicon-envelope"></i>
				        	</span>			            
			            	<form:input path="email" id="email" class="form-control"/>
			            </div>
		        	</div>
		
					<div class="col-sm-3 form-group pull-right address-panel">
		        		<label for="city">City</label> <form:errors path="address.city" cssStyle="color: #c9302c;" />
			            <form:select path="address.city" id="cities" class="form-control">
			            </form:select>
			        </div>
			    </div>
			        
			    <div class="row">
			        <div class="col-sm-3 form-group pull-right address-panel">
		        		<label for="zipCode">ZipCode</label> <form:errors path="address.zipCode" cssStyle="color: #c9302c;" />
			            <form:input path="address.zipCode" id="zipCode" class="form-control"/>
			        </div>
			    </div>
			    
			    <div class="row">
					<div class="col-sm-6 pull-right">
						<div class="pull-right">
			        		<input type="submit" value="Submit" class="btn btn-primary">
			        		<a href="<c:url value="/" />" class="btn btn-default">Cancel</a>
			    		</div>
			    	</div>
			    </div>
			    	
		        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	        </form:form>
        </div>

<%@ include file="/WEB-INF/views/template/footer.jsp" %>
<script src="<c:url value="/resources/js/dynamic-select.js" />"></script>
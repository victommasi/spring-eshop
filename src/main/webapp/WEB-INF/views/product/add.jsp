<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

 <div class="container-wrapper">
	<div class="container">
		<div class="jumbotron">
			<h1> Add Product </h1>
			<p class="lead"> Add a new product to the inventory 		
		          </br> Fill the information below to add a new product: </p>
		</div>	
	
       <form:form action="#" method="post" commandName="product" enctype="multipart/form-data">
        <div class="form-group">
            <label for="name">Name</label> <form:errors path="name" cssStyle="color: #ff0000;" />
            <form:input path="name" id="name" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="category">Category</label>
            <label class="checkbox-inline"><form:radiobutton path="category" id="category"
                   value="instrument" />Instrument</label>
            <label class="checkbox-inline"><form:radiobutton path="category" id="category"
                   value="record" />Record</label>
            <label class="checkbox-inline"><form:radiobutton path="category" id="category"
                   value="accessory" />Accessory</label>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <form:textarea path="description" id="description" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="price">Price</label>  <form:errors path="price" cssStyle="color: #ff0000;" />
            <form:input path="price" id="price" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="condition">Condition</label>
            <label class="checkbox-inline"><form:radiobutton path="condition" id="condition"
                   value="new" />New</label>
            <label class="checkbox-inline"><form:radiobutton path="condition" id="condition"
                   value="used" />Used</label>
        </div>

        <div class="form-group">
            <label for="stock">Unit In Stock</label>  <form:errors path="stock"
                                                                   cssStyle="color: #ff0000;" />
            <form:input path="stock" id="stock" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="manufacturer">Manufacturer</label>
            <form:input path="manufacturer" id="manufacturer" class="form-Control"/>
        </div>

        <br><br>
        <input type="submit" value="Submit" class="btn btn-primary">
        <a href="<c:url value="/admin/inventory" />" class="btn btn-default">Cancel</a>
        </form:form>
	
			
<%@ include file="/WEB-INF/views/template/footer.jsp" %>

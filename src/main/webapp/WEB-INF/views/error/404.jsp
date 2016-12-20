<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>


		<div class="container">
			<div class="container-wrapper-login">
				<div style="text-align:center;">
					<h1>
						<i style="font-size:3.0em; color:#eeeeee;" class="glyphicon glyphicon-exclamation-sign"></i> 
						404
					</h1>
					<h3>  Sorry, page not found</h3>
					<p> </p>
					<a class="btn btn-default" href="<c:url value="javascript:history.back()" />"> 
						Go back
					</a>
				</div>
			</div>
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>
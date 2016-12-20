<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>


		<div class="container">
			<div class="container-wrapper-login">
				<div style="text-align:center;">
					<h1>
						<i style="font-size:3.0em; color:#c9302c;" class="glyphicon glyphicon-ban-circle"></i> 
						403
					</h1>
					<h3>  Sorry, you're not authorized</h3>
					<p> If this is a mistake, please contact us.</p>
					<a class="btn btn-default" href="<c:url value="javascript:history.back()" />"> 
						Go back
					</a>
				</div>
			</div>
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>
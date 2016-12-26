<%@ include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="starter-template">
			<div class="jumbotron">
				<h1>Registration done!</h1>
				<p class="lead">
					You were successfully registrated.<br>
				</p>
			</div>
			<p>
				Go to <a href="<c:url value="/login" />" class="btn btn-link">Login</a>
				page to access the application and continue shopping.
			</p>
		</div>

		<%@ include file="/WEB-INF/views/template/footer.jsp"%>
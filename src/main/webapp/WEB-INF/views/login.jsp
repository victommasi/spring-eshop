<%@include file="/WEB-INF/views/template/header.jsp"%>
<%@ page isELIgnored="false"%>

<div class="container-wrapper-login">

	
	<spring:url value="/login" var="loginUrl" />
	<form:form method="POST" action="${loginUrl}" class="form-signin">
	<div class="simple-panel">
		<h2 class="form-signin-heading">Please log in</h2>
		 <c:if test="${param.error != null}">
			<div class="simple-panel-message error-msg">
                <p>Invalid username and password.</p>
			</div>
        </c:if>
        <c:if test="${param.logout != null}">
            <div class="simple-panel-message logout-msg">
                <p>You have been logged out successfully.</p>
            </div>
        </c:if>
		<div class="simple-panel-box">
			<div class="form-group  has-feedback">
				<label for="username" class="sr-only">Username</label>
				<input type="text" name="username" id="username" class="form-control input-lg" placeholder="Username" autofocus="autofocus"></input>
				<span class="glyphicon  glyphicon-envelope  form-control-feedback login-icon"></span>
			</div>
			<div class="form-group  has-feedback">
				<label for="password" class="sr-only">Password</label>
				<input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password"></input>
				<span class="glyphicon  glyphicon-lock  form-control-feedback login-icon"></span>
			</div>
			
			<div class="checkbox">
				<!-- <label> <input type="checkbox" value="remember-me">
					Remember me
				</label> -->
			</div>
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		</div>
	</div>
	</form:form>
</div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>
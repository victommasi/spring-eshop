<%@include file="/WEB-INF/views/template/header.jsp"%>
<%@ page isELIgnored="false"%>

<div class="container-wrapper-login">

	
	<spring:url value="/login" var="loginUrl" />
	<form:form method="POST" action="${loginUrl}" class="form-signin">
		<h2 class="form-signin-heading">Please Log in</h2>
		 <c:if test="${param.error != null}">
            <div class="alert alert-danger alert-dismissible">
           	    <button type="button" class="close" data-dismiss="alert" ><span aria-hidden="true">&times;</span></button>
                <p>Invalid username and password.</p>
            </div>
        </c:if>
        <c:if test="${param.logout != null}">
            <div class="alert alert-success alert-dismissible">
            	<button type="button" class="close" data-dismiss="alert" ><span aria-hidden="true">&times;</span></button>
                <p>You have been logged out successfully.</p>
            </div>
        </c:if>
		<label for="username" class="sr-only">Username</label>
		<input type="text" name="username" id="username" class="form-control" placeholder="Username"></input>
		<label for="password" class="sr-only">Password</label>
		<input type="password" name="password" id="password" class="form-control" placeholder="Password"></input>
		<div class="checkbox">
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form:form>
</div>

<%@include file="/WEB-INF/views/template/footer.jsp"%>
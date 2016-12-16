<%@include file="/WEB-INF/views/template/header.jsp" %>
    
    <div class="container-wrapper-login">
      
     <spring:url value="/login" var="loginUrl" />
      <form:form method="POST" action="${loginUrl}" modelAttribute="user" class="form-signin">
        <h2 class="form-signin-heading">Please Log in</h2>
        <label for="username" class="sr-only">Username</label>
        <form:input type="text"  path="username" id="username" class="form-control" placeholder="Username"></form:input>
        <label for="password" class="sr-only">Password</label>
        <form:input type="password" path="password" id="password" class="form-control" placeholder="Password"></form:input>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
      </form:form>
    </div>

<%@include file="/WEB-INF/views/template/footer.jsp" %>
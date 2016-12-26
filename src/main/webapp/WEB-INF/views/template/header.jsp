<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Shoes Store</title>

<!-- Bootstrap core CSS -->
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="<c:url value="/resources/css/carousel.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/eshop.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/login.css" />" rel="stylesheet">


</head>
<body>

<!--  
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
-->

<!-- NAVBAR
================================================== -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar"
					aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="<c:url value="/"/> ">Shoes Store</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="<c:url value="/about"/> ">About</a></li>
					<li><a href="<c:url value="/product"/> ">Shoes</a></li>
					<li><a href="#contact">Contact</a></li>
				</ul>
				<div class="navbar-right">
					<ul class="nav navbar-nav">
						<c:if test="${pageContext.request.userPrincipal.name  != null}">
							<li class="navbar-text">Welcome, ${pageContext.request.userPrincipal.name}!</li>
	                       
	                        <c:if test="${pageContext.request.userPrincipal.name != 'admin'}">
	                            <li>
	                            	<a href="<c:url value="/customer/cart" />">Cart
	                            		<i class="glyphicon glyphicon-shopping-cart"></i>	
	                            	</a>
	                            </li>
	                        </c:if>
	                        <c:if test="${pageContext.request.userPrincipal.name  == 'admin'}">
	                            <li>
	                            	<a href="<c:url value="/admin" />">Settings
									    <i class="glyphicon glyphicon-cog"> </i>                        
	                            	</a>
	                            </li>
	                        </c:if>
	                        
	                        <li>
	                        	<a href="<c:url value="/logout" />">Logout
		                        	<i class="glyphicon glyphicon-log-out"></i>
	                        	</a>
	                        </li>
						</c:if>
					</ul>
					<c:if test="${pageContext.request.userPrincipal.name  == null}">
						<form  class="navbar-form navbar-right">
							<a href="<c:url value="/login" />" class="btn btn-primary">Login
							</a>
							<a href="<c:url value="/customer/register" />" class="btn btn-link">Register</a>
						</form>
					</c:if>
				</div>
			</div>
		</div>
	</nav>

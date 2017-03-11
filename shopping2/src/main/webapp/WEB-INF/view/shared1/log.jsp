
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>


<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="vertical-align">
			<a class="navbar-brand" href="#"><img src="" /></a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="${contextRoot}/home">Home</a></li>
			<li><a href="${contextRoot}/about">About Us </a></li>
		</ul>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="${contextRoot}/Register"><span
					class="glyphicon glyphicon-user"></span> Sign Up</a></li>
			<security:authorize access="isAnonymous()">

				<li><a href="${contextRoot}/login"><span
						class="glyphicon glyphicon-log-in"></span>Login</a></li>
			</security:authorize>
			<security:authorize access="isAuthenticated()">

				<li><a href="${contextRoot}/logout"><span
						class="glyphicon glyphicon-log-in"></span>Login</a></li>
			</security:authorize>


		</ul>
	</div>
</nav>

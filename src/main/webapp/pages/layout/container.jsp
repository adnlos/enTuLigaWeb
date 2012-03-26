<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib prefix="cr" uri="http://java.sun.com/jstl/core" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<style type="text/css">
  .sidebar-nav {
    padding: 9px 0;
  }
</style>
<!-- ICONOS -->
<link rel="shortcut icon" type="images/x-icon"  href="images/favicon.ico">
<!-- HOJAS CSS -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="css/general.css" type="text/css">
<!-- JS -->
<script type="text/javascript" src="http://platform.twitter.com/widgets.js"></script>
    <script src="jquery/js/jquery.js"></script>
    <script src="jquery/js/google-code-prettify/prettify.js"></script>
    <script src="jquery/js/bootstrap-transition.js"></script>
    <script src="jquery/js/bootstrap-alert.js"></script>
    <script src="jquery/js/bootstrap-modal.js"></script>
    <script src="jquery/js/bootstrap-dropdown.js"></script>
    <script src="jquery/js/bootstrap-scrollspy.js"></script>
    <script src="jquery/js/bootstrap-tab.js"></script>
    <script src="jquery/js/bootstrap-tooltip.js"></script>
    <script src="jquery/js/bootstrap-popover.js"></script>
    <script src="jquery/js/bootstrap-button.js"></script>
    <script src="jquery/js/bootstrap-collapse.js"></script>
    <script src="jquery/js/bootstrap-carousel.js"></script>
    <script src="jquery/js/bootstrap-typeahead.js"></script>
    <script src="jquery/js/application.js"></script>
    <script src="jquery/jquery-1.7.js"></script>

<!-- <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script> -->
<!-- <script type="text/javascript" src="bootstrap/js/bootstrap.js"></script> -->
<!-- <script type="text/javascript" src="jquery/js/bootstrap-tab.js"></script> -->


	<body>
		<div>
			<tiles:insertAttribute name="header" />
		</div>
		<div class="wrapper">
			<tiles:insertAttribute name="body" />
		</div>
		<div class="push"></div>	
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</body>
</html>
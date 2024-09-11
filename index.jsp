<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
<style type="text/css">
	a{
		text-decoration:none;
		color:black;
		font-family: sans-serif;
		border: 2px solid black;
		padding:1.5px;
		background-color:yellow;
		
	}
</style>
</head>
<body style="margin:0px;border:0px">
	<div style ="background-color:#FA2A55;
	width:100vw;
	height:100vh;
	display:flex;
	justify-content:center;
	align-items:center">
		<div style="background-color:cyan;width:50vw;height:80vh;display:flex;justify-content:space-around;align-items:center;flex-direction: column;">
			<h1 style="font-family: fantasy">Choose Your Operation</h1>
			<h2><a href="EmployeeDetails.jsp">Add Your Details</a></h2>
			
			
			<h2><a href="Delete.jsp">Delete Details Of Employee</a></h2>
			
		</div>
	</div>
</body>
</html>
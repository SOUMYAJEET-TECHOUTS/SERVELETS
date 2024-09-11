<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Read Details Of Employee</title>
</head>
<style type="text/css">
body {
margin:0px;
padding:0px;
width:100vw;
height:100vh;
background-color: #FF724C;
display:flex;
flex-direction:column;
justify-content: center;
align-items: center;
}
a{
color: white;
border: 2px solid black;
		padding:2.5px;
		background-color:black;
		text-decoration: none;
		border-radius: 12px;

}
</style>
<body>
<h1>Employee Details</h1>
<form action="Fetch" method="post">
 
 <input type="text" name="id" required>
 <input type="submit" value="SEARCH">
 <input type="submit" value="ReturnToHome">
 <h2><a href="UpdateDetails.jsp">Update The Details</a></h2>
</form>

</body>
</html>

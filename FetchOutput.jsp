<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
    <body>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            width: 300px;
        }
        h1 {
            margin-bottom: 20px;
            text-align: center;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        .form-group input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        .form-group input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
	<%
        // Retrieve the attributes set by the servlet
        String id = (String) request.getAttribute("id");
        String name = (String) request.getAttribute("name");
        String designation = (String) request.getAttribute("designation");
    %>
    <div class="container">
    <h1>Employee Registration</h1>
	    <div class="form-group">
            <label for="empId">Employee ID:</label>
		<input type= "text" readonly name= "id" value= " <%= id != null ? id : "" %> " >
		</div>
		<div class="form-group">
            <label for="empName">Name:</label>
		<input type= "text" readonly name= "name" value= " <%= name != null ? name : "" %> " >
		</div>
		<div class="form-group">
            <label for="empDesignation">Designation:</label>
		<input type= "text" readonly name= "designation" value= " <%= designation != null ? designation : "" %> " >
        </div>
        </div>
</body>
</html>
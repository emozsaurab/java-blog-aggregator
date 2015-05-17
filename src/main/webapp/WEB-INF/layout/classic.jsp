<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Bootstrap added -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<!-- 
jquery cdn from google CDN ,which means we dnt need to add jquery file and it will be downloaded from online server and will be loader faster-->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<title><tiles:getAsString name="title"/></title>
</head>

   <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<body>
<div class="container">
   <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href='<spring:url value="/" />'>JBA</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href='<spring:url value="/" />'>Home</a></li>
              <li><a href="#">About</a></li>
              <li><a href="#">Contact</a></li>
              
            </ul>
            
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
  <tiles:insertAttribute name="body"/>   
  
  
  
  
  
  
  
  
  
<br><br>
<center>
<tiles:insertAttribute name="footer"/>

</center>
</div>

</body>
</html>
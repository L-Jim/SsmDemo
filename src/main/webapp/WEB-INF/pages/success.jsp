<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String contextPath1 = request.getContextPath();%>
<%
String contextPath = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+contextPath+"/";
%>
<html>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/res/css/style.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/res/js/jquery-1.11.1.min.js" ></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<!-- <base href="http://localhost:8080/SsmDemo/"> -->
	<base href="<%=basePath%>">
	
</head>
<script type="text/javascript">
$(function(){
			
		});
</script>
<body>
	Hello,work 
	<br>
request中names:${requestScope.username}<br/>

 <hr/>
session中names:${sessionScope.username }<br/>

<br><br><br>


</body>
</html>
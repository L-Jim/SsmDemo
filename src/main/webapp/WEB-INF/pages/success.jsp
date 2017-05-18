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
	pageinfo: ${page}
	<br>
	<%=basePath%>
	<br>
	
	<br>
	${ pageContext.request.contextPath} 
	<br>
	pageinfo_list: ${page.list}
<br><br><br>
<table class="gridtable" style="width:90%;text-align: center;">
	 	<tr>
	 		<th>ID</th>
	 		<th>username</th>
	 		<th>password</th>
	 		<th>usertype</th>
	 		<th>realname</th>
	 		<th>qq</th>
	 		<th>邮件</th>
	 		<th>电话</th>
	 	</tr>
	<c:forEach items="${page.list}" var="user">
		<tr>
	 		<td>${user.id }</td>
	 		<td>${user.username}</td>
	 		<td>${user.password}</td>
	 		<td>${user.usertype}</td>
	 		<td>${user.realname}</td>
	 		<td>${user.qq}</td>
	 		<td>${user.email}</td>
	 		<td>${user.tel}</td>
	 	</tr>
	</c:forEach>
		
</table>

                <c:forEach items="${page.navigatepageNums}" var="nav">
                 <c:if test="${nav==page.pageNum}">
                        <td style="font-weight: bold;">${nav}</td>
                    </c:if>
                    <c:if test="${nav!=page.pageNum}">
               
                        <td>
                            <a href="user/getuser?i=${nav}">${nav}</a>
                        </td>
                    </c:if>
                </c:forEach>

</body>
</html>
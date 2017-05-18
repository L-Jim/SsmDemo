<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
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
	<h1 align="center"><spring:message code="city"/></h1>
	<br>
	Language: <a href="?i=1&locale=zh_CN"><spring:message code="language.cn" /></a>--<a href="?i=1&locale=en_US"><spring:message code="language.us" /></a>
	<br>
	pageinfo: ${page}
<br><br><br>
<table class="gridtable" style="width:90%;text-align: center;">
	 	<tr>
	 		<th><spring:message code="city.id"/></th>
	 		<th><spring:message code="city.name"/></th>
	 		<th><spring:message code="city.state"/></th>

	 	</tr>
	<c:forEach items="${page.list}" var="city">
		<tr>
	 		<td>${city.id }</td>
	 		<td>${city.cityname}</td>
	 		<td>${city.citycode}</td>

	 	</tr>
	</c:forEach>
		
</table>

                <c:forEach items="${page.navigatepageNums}" var="nav">
                 <c:if test="${nav==page.pageNum}">
                        <td style="font-weight: bold;">${nav}</td>
                    </c:if>
                    <c:if test="${nav!=page.pageNum}">
               
                        <td>
                            <a href="city/getcitys?i=${nav}">${nav}</a>
                        </td>
                    </c:if>
                </c:forEach>

</body>
</html>
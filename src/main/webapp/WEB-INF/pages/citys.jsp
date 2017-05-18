<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="tag\lzw" prefix="lzw"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String contextPath1 = request.getContextPath();%>
<%
String contextPath = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+contextPath+"/";
%>
<html>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/res/css/style.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/res/js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/res/js/myjs/pageQuery.js" ></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<!-- <base href="http://localhost:8080/SsmDemo/"> -->
	<%-- <base href="<%=basePath%>"> --%>
	
</head>
<script type="text/javascript">
$(function(){
		});

</script>
<body>
	<h1 align="center"><spring:message code="city"/></h1>
	include指令
	<%@ include file="i18n.jsp"%>
	include标准动作
    <jsp:include page="i18n.jsp"/>
<br><br><br>

	pageinfo: ${page}
<br><br><br>
<form action="getcitys" method="post"
	name="form1" id="form1">
	<input type="hidden" name="pageNum" value="1"> 
<table width="98%" border="1" align="center" cellpadding="0"
	cellspacing="0" bordercolorlight="#CCCCCC" bordercolordark="#aaaaaa"
	bgcolor="#EBEBEB">
	<tr class='MultiColor1'>
		
		<td align="right" bgcolor="#EBEBEB" width="10%" nowrap>
			父节点：<input name="fathernode" type="text"
						id="fathernode" size="13"
						value="${city.fathernode}" >
			</td>
		<td colspan='1' align="left"><input type="submit"
			class="button3" id="query" value="查询" title="查询" />
	</tr>
</table>
</form>

<table class="gridtable" style="width:90%;text-align: center;">
	 	<tr>
	 		<th><spring:message code="city.id"/></th>
	 		<th><spring:message code="city.name"/></th>
	 		<th><spring:message code="city.code"/></th>
			<th><spring:message code="city.fathernode"/></th>
	 	</tr>
	<c:forEach items="${page.list}" var="city">
		<tr>
	 		<td>${city.id }</td>
	 		<td>${city.cityname}</td>
	 		<td>${city.citycode}</td>
	 		<td>${city.fathernode}</td>

	 	</tr>
	</c:forEach>
		
</table>
分页：aaa
<lzw:pageNavigate pageInfo="${page}" />

</body>
</html>
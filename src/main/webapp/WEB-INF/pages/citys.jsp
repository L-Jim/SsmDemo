<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- org.springframework.web.servlet.tags.form中 -->
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
    <!-- org.springframework.web.servlet.tags中 -->
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
	<!-- bootstrap -->
	<link rel="stylesheet" href="<%=request.getContextPath()%>/res/bootstrap/css/bootstrap.min.css">  
	<script src="<%=request.getContextPath()%>/res/bootstrap/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/res/css/style.css"/>
<script type="text/javascript" src="<%=request.getContextPath()%>/res/js/jquery-3.2.1.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/res/js/myjs/pageQuery.js" ></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/res/js/myjs/table.js" ></script>
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
	<%@ include file="header.jsp"%>
	include标准动作
    <jsp:include page="header.jsp"/>
<br><br><br>

	pageinfo: ${page}
<br><br><br>
<div class="easyui-panel" title="查询" style="width:90%" align="center" >
		<div style="padding:10px 60px 20px 60px">
	    <form name="queryForm" id="queryForm" method="post" action="getcitys">
	    <input type="hidden" name="pageNum" value="1"> 
	    	<table cellpadding="5">
	    		<tr>
	    			<td>父节点:</td>
	    			<td><input class="easyui-textbox" type="text" name="fathernode"/></td>
	    		</tr>
	    	</table>
	    </form>
	    <div style="text-align:center;padding:5px">
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submit(1)">查询</a>
	    	
	    </div>
	    </div>
	</div>

<table class="table table-striped table-bordered table-hover table-condensed"  style="width:90%;text-align: center;" >
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
分页：
<lzw:pageNavigate pageInfo="${page}" />

</body>
</html>
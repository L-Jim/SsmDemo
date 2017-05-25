<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">  
    onload=function(){
        setInterval(go, 1000);
    };
    var x=3; //利用了全局变量来执行  
    function go(){
    x--;
        if(x>0){
        document.getElementById("time").innerHTML=x;  //每次设置的x的值都不一样了。  
        }else{
        location.href='${pageContext.request.contextPath }/Login';  
        }
    }
</script>
<font color="red" size="5">${message }</font>
将在<font id="time" color="red" size="5"></font>秒后跳转到登陆页面！
</body>
</html>
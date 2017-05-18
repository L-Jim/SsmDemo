function submit(pageNum){
	//判断是否是点击页码跳转,pageNum为0是不是点击页码跳转
	var a = pageNum==0?$("#page").val():pageNum;
	form1.pageNum.value=a;
//	alert("a:"+a);
	form1.submit();
}
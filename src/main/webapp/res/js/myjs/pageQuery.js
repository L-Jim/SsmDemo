/*
 * 用于分页查询结合form表单的提交
 * 查询form表单name固定为queryForm
 */
function submit(pageNum){
	//判断是否是点击页码跳转,pageNum为0是不是点击页码跳转
	var a = pageNum==0?$("#page").val():pageNum;
	//通过name选择对象
	queryForm.pageNum.value=a;
//	alert("a:"+a);
	queryForm.submit();
}


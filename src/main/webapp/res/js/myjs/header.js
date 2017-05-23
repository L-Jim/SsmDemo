/*
 * 用于显示时间
 * 在页面上引入.js
 * 再定义2个节点输出时间：
 *   北京时间<div id="times"></div>
 * 	  电脑时间<div id="localTime"></div>
 */
var timestamp = (Date.parse(new Date())).toString();
var tt = parseInt(timestamp.substring(0, 10));
var i=0;
	function t()
	{
		now=new Date((tt+i+28800)*1000);
		i++;
		document.getElementById("times").innerHTML=now.toUTCString();
	}
setInterval("t()",1000);
	function l()
	{
		today=new Date();
		document.getElementById("localTime").innerHTML= today.toLocaleString();
	}
setInterval("l()",1000);

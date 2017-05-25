
function overTbColor()
{
	var srcObj = event.srcElement;
	var headerobj;
	var bodyobj;
	if(srcObj.tagName.toUpperCase( ) == "TH"){
		headerobj = srcObj;
	} //else if (srcObj.parentNode.tagName.toUpperCase( ) == "TH"){
		//headerobj = srcObj.parentNode;
	//}
	if(headerobj != null ){
		headerobj.style.color="#CE0010";
		headerobj.style.cursor="hand";
		//obj.style.backgroundColor = "#999999";
	}
	if(srcObj.tagName.toUpperCase( ) == "TD"){
		bodyobj = srcObj.parentNode;
	}
	if (bodyobj != null){
	  bodyobj.bgColor="#FAEBD7";
	}
}

function outTbColor()
{
	var srcObj = event.srcElement;
	var headerobj;
	var bodyobj;
	if(srcObj.tagName.toUpperCase( ) == "TH"){
		headerobj = srcObj;
	} //else if(srcObj.parentNode.tagName.toUpperCase( ) == "TH"){
	//	headerobj = srcObj.parentNode;
	//}
	if(headerobj != null){
		headerobj.style.color="#000000";
		headerobj.style.cursor="default";
		//obj.style.backgroundColor = "";
	}
	if(srcObj.tagName.toUpperCase( ) == "TD"){
		bodyobj = srcObj.parentNode;
	}
	if (bodyobj != null){
	  bodyobj.bgColor="#FFFFFF";
	}
}
function clickOnTH(containerId)
{
	try
	{
		var srcObj = event.srcElement,obj;
		if (srcObj.name == "expandImg") return;
		
		if(srcObj.tagName.toUpperCase( ) == "TH")
			obj = srcObj;
		else if(srcObj.parentNode.tagName.toUpperCase( ) == "TH")
			obj = srcObj.parentNode;
			
		if (obj.tagName.toUpperCase( ) != "TH") return;

		if(obj != null)
		{
			var ele = obj.children;
			for(var i=0;i<ele.length;i++)
			{
				if(ele[i].tagName.toUpperCase()=="A"&&ele[i].getAttribute("href")!=null)
				{
					if (containerId == "undefined" || containerId == "" || containerId == null)
						window.location.href = ele[i].getAttribute("href");
					else
						SortlinkThisPage(ele[i].getAttribute("href"), containerId);
					break;
				}
			}
		}
	}
	catch(e)
	{
	}
}

function overTHColor()
{
	var srcObj = event.srcElement,obj;
	if(srcObj.tagName.toUpperCase( ) == "TH")
		obj = srcObj;
	else if(srcObj.parentNode.tagName.toUpperCase( ) == "TH")
		obj = srcObj.parentNode;

	if(obj != null)
	{
		obj.style.color="#CE0010";
		obj.style.cursor="hand";
		//obj.style.backgroundColor = "#999999";
	}
}

function outTHColor()
{
	var srcObj = event.srcElement,obj;
	if(srcObj.tagName.toUpperCase( ) == "TH")
		obj = srcObj;
	else if(srcObj.parentNode.tagName.toUpperCase( ) == "TH")
		obj = srcObj.parentNode;

	if(obj != null)
	{
		obj.style.color="#000000";
		obj.style.cursor="default";
		//obj.style.backgroundColor = "";
	}
}
function outTHColorNew()
{
	var srcObj = event.srcElement,obj;
	if(srcObj.tagName.toUpperCase( ) == "TH")
		obj = srcObj;
	else if(srcObj.parentNode.tagName.toUpperCase( ) == "TH")
		obj = srcObj.parentNode;

	if(obj != null)
	{
		obj.style.color="#818181";
		obj.style.cursor="default";
		//obj.style.backgroundColor = "";
	}
}

package com.lzw.tool;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.github.pagehelper.PageInfo;
import com.sun.tools.doclets.internal.toolkit.taglets.SimpleTaglet;
/**
 * 自定义分页标签
 * @author lzw
 * @version 1.0
 * @since
 * Description:传入 分页信息pageInfo，根据pageInfo的内容输出分页
 * 开发步骤：
 * 1.创建XXX.tld文件定义标签的书写规范
 * 2.编写继承 SimpleTagSupport等的标签运行类
 * 3.在jsp中引用<%@ taglib uri="tag\lzw" prefix="lzw"%>
 */
public class PageNavigate extends SimpleTagSupport{

	private PageInfo pageInfo;
    public void doTag() 
            throws JspException, IOException
        {

    	JspWriter out = getJspContext().getOut();
    int[] navigatepageNum=pageInfo.getNavigatepageNums();
    out.print("<table class=\"gridtable\" style=\"width:40%;text-align: center;\"><tr>");
    out.println("<td>第"+pageInfo.getPageNum()+"/"+pageInfo.getPages()+"页</td>");
    if(pageInfo.isHasPreviousPage())
    {
    	out.println("<td><a href=\"#\" onclick=\"submit(1);return false\">首页</a></td>");
    	out.println("<td><a href=\"#\" onclick=\"submit("+pageInfo.getPrePage()+");return false\">上一页</a></td>");
    }
    for(int i=0;i<navigatepageNum.length;i++)
    	if(navigatepageNum[i]==pageInfo.getPageNum())
    	{
    		out.println("<td style=\"font-weight: bold;\">"+navigatepageNum[i]+"</td>");
    	}else{
    		out.println("<td><a href=\"#\" onclick=\"submit("+navigatepageNum[i]+");return false\">"+navigatepageNum[i]+"</a></td>");
    		
    	}
	    if(pageInfo.isHasNextPage())
	    {
	    	out.println("<td><a href=\"#\" onclick=\"submit("+pageInfo.getNextPage()+");return false\">下一页</a></td>");
	    	out.println("<td><a href=\"#\" onclick=\"submit("+pageInfo.getPages()+");return false\">末页</a></td>");
	    }
	    out.println("<td>跳转到：<input name=\"page\" type=\"text\" id=\"page\" size=\"4\" value=\"\" >&nbsp;页&nbsp;&nbsp;<a href=\"#\" onclick=\"submit(0);return false\">GO</a></td>");
	    out.print("</tr></table>");
    	out.print("<br>");
        }
	public PageInfo getPageInfo() {
		return pageInfo;
	}
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

}

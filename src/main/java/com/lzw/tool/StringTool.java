package com.lzw.tool;

public class StringTool {

/*
 * 小写字母变大写只作用于字母
 */
	public static String changeAllToUpper(String string)
	{
		StringBuffer sb = new StringBuffer();
		if(string!=null)
		{
			for(int i=0,j=string.length();i<j;i++)
			{
				char c = string.charAt(i);
				if(Character.isLowerCase(c))
				{
					c=Character.toUpperCase(c);
				}
				sb.append(c);
			}
		}
		return sb.toString();
		
	}
	/*
	 * 大写字母变小只作用于字母
	 */
	public static String changeAllToLower(String string)
	{
		StringBuffer sb = new StringBuffer();
		if(string!=null)
		{
			for(int i=0,j=string.length();i<j;i++)
			{
				char c = string.charAt(i);
				if(Character.isUpperCase(c))
				{
					c = Character.toLowerCase(c);
				}
				sb.append(c);
			}
		}
		return sb.toString();
		
	}
}

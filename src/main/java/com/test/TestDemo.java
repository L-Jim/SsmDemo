package com.test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s="";
		char[] text = new char[4];
		long startTime=System.nanoTime();//获取开始时间 
		for(int i=0;i<4;i++)
		{
			text[i]=getRandomChar();
		}
		long endTime=System.nanoTime(); //获取结束时间  
		s=new String(text);
		System.out.println(s+"1程序运行时间： "+(endTime-startTime)+"ns");
		
		startTime=System.nanoTime();//获取开始时间  
		s=generateString(4);
		endTime=System.nanoTime(); //获取结束时间  
		System.out.println(s+"2程序运行时间： "+(endTime-startTime)+"ns");

		
		 System.exit(1);
	}
	
	private static String fxkTool(String[] a) throws Exception {
		StringBuffer sb = new StringBuffer();
		for(int i = 0,j = a.length;i<j ; i++)
		{
			sb.append(i==0?"":",");
			sb.append("'");
			 sb. append(a[i]);
			 sb.append("'");
/*			 
			 if(i!=j-1)
			 {
				 sb. append(",");
			 }
 */
		}
		String s = sb.toString();
		
//		System.out.println();
//		System.out.println(s);
		return s;		
	}

	public static String generateString(int length) {
		String characters= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		int j=characters.length();
		System.out.println(j);
        char[] text = new char[length];
        Random random=new Random();
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(text);
    }
	
	public static char getRandomChar() {
        // 生成一个0、1、2的随机数字
		Random random=new Random();
        int rand = random.nextInt(2);
        long itmp = 0;
        char ctmp = '\u0000';
        switch (rand) {
       // 生成大写字母
        case 1:
            itmp = random.nextInt(25)+65;
            ctmp = (char) itmp;
            return ctmp;
            // 生成小写字母
        case 2:
            itmp = random.nextInt(25)+97;
            ctmp = (char) itmp;
            return ctmp;
            // 生成数字
        default:
            itmp = random.nextInt(9);
            return (char) itmp;
        }
    }



}

package com.test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(new Date());
//		String[] hj = new String[]{"公众环节_public", "号线环节_send", "激活环节_run", "调度派单环节_firstsend", "施工环节_get","整体环节_all"};
//		String[] colStrArr=getTbHead(hj);
//		String[] colStrArr1=getName(hj);
//		System.out.println(TestDemo.creatTbHead(colStrArr));
//		System.out.println(TestDemo.creatTbBody(colStrArr1));
//		System.out.println(new Date());
		
//		long startTime=System.nanoTime();//获取开始时间  
//		String s="haffjd;hd;ahfhfida;ldfa;f;as";
//		s=s.replaceAll("a", "A");
//		long endTime=System.nanoTime(); //获取结束时间  
//		System.out.println(s+"程序运行时间： "+(endTime-startTime)+"ns");
//		
//		 startTime=System.nanoTime();//获取开始时间  
//		 s="aldf;%sadsfad%sadfalkdjla%sakjfa;lkfjd%saskdjfa%srf";
//		s=String.format(s, "Q", "Q", "Q", "Q", "Q");
//		 endTime=System.nanoTime(); //获取结束时间  
//		System.out.println(s+"程序运行时间： "+(endTime-startTime)+"ns");
		String[] colStrArr = new String[]{
				"publicnum",
			     "sendnum",
			     "sendavelong",
			     "sendstopnum",
			     "sendstoprate"
        };
		try {
			String s = fxkTool(colStrArr);
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.exit(1);
	}
	
	
	public static String[] getName(String[]hj){
		String[] colStrArr = new String[]{
				"publicnum",
			     "sendnum",
			     "sendavelong",
			     "sendstopnum",
			     "sendstoprate",
			       "sendstopavelong",
			       "sendleaverate",
			       "sendgonum",
			       "sendgorate",
			       "runnum",
			       "runavelong",
			       "runstopnum",
			       "runstoprate",
			       "runstopavelong",
			       "runleaverate",
			       "rungonum",
			       "rungorate",
			       "firstsendnum",
			       "firstsendlong",
			       "firstsendleaverate",
			       "firstsendgonum",
			       "firstsendgorate",
			       "getnum",
			       "getlong",
			       "getfinishnum",
			       "getgonum",
			     "getgorate",
			      "gettdnum",
			      "gettdrate",
			      "allfinishnum",
			     "allovertimenum",
			     "allovertimerate",
			    "allavelong"
        };
		List<String> list = new ArrayList<String>();
		for(int j=0;j<hj.length;j++)
		
		{
			String[] temp=hj[j].split("_");
			for(int i=0;i<colStrArr.length;i++)
			{
				if(colStrArr[i].startsWith(temp[1]))
				{
					list.add(colStrArr[i]);
				}
			}
		}
		list.add(0, "areaname");
		String[] colStrArr1 = new String[list.size()];
        for(int i = 0;i < list.size();i++){
             colStrArr1[i] = list.get(i);
        }
		return colStrArr1;
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
	public static String[] getTbHead(String[]hj){
		String[] colStrArr = new String[]{
        		"公众环节>订单量",
        		
        		"号线环节>订单量",
        		"号线环节>平均处理时长(分)",
        		"号线环节>卡单量",
        		"号线环节>卡单率",
        		"号线环节>卡单平均处理时长(分)",
        		"号线环节>订单留存率",
        		"号线环节>撤单量",
        		"号线环节>撤单占比",
        		
        		"激活环节>订单量",
        		"激活环节>平均处理时长(分)",
        		"激活环节>卡单量",
        		"激活环节>卡单率",
        		"激活环节>卡单平均处理时长(分)",
        		"激活环节>订单留存率",
        		"激活环节>撤单量",
        		"激活环节>撤单占比",
        		
        		"调度派单环节>订单量",
        		"调度派单环节>平均处理时长(分)",
        		"调度派单环节>订单留存率",
        		"调度派单环节>撤单量",
        		"调度派单环节>撤单占比",
        		
        		"施工环节>订单量",
        		"施工环节>平均处理时长(分)",
        		"施工环节>竣工量",
        		"施工环节>撤单量",
        		"施工环节>撤单占比",
        		"施工环节>退单量",
        		"施工环节>退单占比",
        		
        		"整体环节>竣工量",
        		"整体环节>超时竣工量",
        		"整体环节>超时竣工订单率",
        		"整体环节>平均处理时长(分)",
        };
		List<String> list = new ArrayList<String>();
		for(int j=0;j<hj.length;j++)
		
		{
			String[] temp=hj[j].split("_");
			for(int i=0;i<colStrArr.length;i++)
			{
				if(colStrArr[i].startsWith(temp[0]))
				{
					list.add(colStrArr[i]);
				}
			}
		}
		list.add(0, "地市");
		String[] colStrArr1 = new String[list.size()];
        for(int i = 0;i < list.size();i++){
             colStrArr1[i] = list.get(i);
        }
		return colStrArr1;

		
	}
	public static String creatTbHead(String[] colStrArr){
        int maxrows = 2;//
        StringBuffer tbHeadSb = new StringBuffer();

             for(int i = 0; i<maxrows;i++){
                  tbHeadSb.append("<tr class=\"header\">");

                  String preCol = "";
                  String preCol3 = "";
                  int preRow = 0;
                  int cols = 1;
                  for(int j = 0;j<colStrArr.length;j++){
                       String tempCol = colStrArr[j];
                       if(tempCol.length() > 0 && tempCol.indexOf(">") == -1 && i ==0){
                            tbHeadSb.append("<th rowspan="+maxrows+">")
                            .append(tempCol).append("</th>");
                       }else if(tempCol.length() > 0 && tempCol.indexOf(">") > -1){
                            String[] arrtemp = tempCol.split(">");
                            String tempCol2 = "";
                            String tempCol3 = "";
                            int row = 0;
                                                         
                            if(arrtemp.length == maxrows){
                                 row = 1;
                                 for(int z=0;z<=i;z++)
                                 {
                                	 tempCol3 = tempCol3+arrtemp[z];
                                 }
                                 tempCol2 = arrtemp[i];
                            }else{
                                 if(i < arrtemp.length -1){
                                      tempCol2 = arrtemp[i];
                                      for(int z=0;z<=i;z++)
                                      {
                                     	 tempCol3 = tempCol3+arrtemp[z];
                                      }
                                      row =  1;
                                 }
                                 else if(i == arrtemp.length -1){
                                      tempCol2 = arrtemp[i];
                                      for(int z=0;z<=i;z++)
                                      {
                                     	 tempCol3 = tempCol3+arrtemp[z];
                                      }
                                      row = maxrows - arrtemp.length + 1;
                                 }
                            }
                            if(tempCol3.equals(preCol3)){
                                 cols++;
                                 if(j == colStrArr.length -1 && row > 0){
                                      tbHeadSb.append("<th rowspan="+(row)+" colspan="+cols+">")
                                      .append(tempCol2).append("</th>");
                                 }
                            }else{
                                 if(j == 0 && row > 0){
                                      tbHeadSb.append("<th rowspan="+(row)+" colspan="+cols+">")
                                      .append(tempCol2).append("</th>");                                       
                                 }else{                                       
                                 if(preCol.length() >0)
                                      tbHeadSb.append("<th rowspan="+(preRow)+" colspan="+cols+">")
                                      .append(preCol).append("</th>");
                                      if(j == colStrArr.length -1)
                                           tbHeadSb.append("<th rowspan="+(row)+" colspan="+cols+">")
                                           .append(tempCol2).append("</th>");
                                      preCol = tempCol2;
                                      preCol3 = tempCol3;
                                     
                                 }
                                 cols = 1;
                                 preRow = row;
                            }
                           
                           
                       }
                  }
                  tbHeadSb.append("</tr>");
             }       
        return tbHeadSb.toString();
   }
	
	public static String creatTbBody(String[] colStrArr){
		 StringBuffer tbHeadSb = new StringBuffer();
		 tbHeadSb.append("<tr align=\"center\">");
		 for(int i=0;i<colStrArr.length;i++)
		 {
			tbHeadSb.append("<td align=\"center\" nowrap>");
			tbHeadSb.append(colStrArr[i]);
			tbHeadSb.append("</td>");
		 }
		 tbHeadSb.append("</tr>");
		 return tbHeadSb.toString();
	}

}

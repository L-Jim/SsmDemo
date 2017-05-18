package com.test;

import java.io.File;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class readXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list;
		try {
			list = readXML.readXml("Location");
			System.out.println(list);// 输出列表
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<String> readXml(String node) throws Exception {
		DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		File f = new File("D:\\MyProject\\LocList.xml");
		if (!f.exists())
			return null;
		Document document = db.parse(f);
		Element element = document.getDocumentElement();
		String nodeName = node;
		// NodeList nlist = element.getElementsByTagName(nodeName);
		NodeList nlist = element.getChildNodes();

		List<String> l = showElem(nlist);
		return l;

	}

	public static List<String> showElem(NodeList nl) {

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < nl.getLength(); i++) {
			Node CountryNode = nl.item(i);// 得到当前节点
			if (CountryNode instanceof Element) {
				String CountryName = ((Element) CountryNode).getAttribute("Name");
				String CountryCode = ((Element) CountryNode).getAttribute("Code");
				System.out.print("国家名:" + CountryName);
				System.out.println("----国家代号:" + CountryCode);
				// CountryNode;
				// 子节点
			}
				NodeList State = CountryNode.getChildNodes();
				for (int x = 0; x < State.getLength(); x++) {
					Node StateNode = State.item(x);// 得到当前节点
					// 判断取出的值是否属于Element元素,目的是过滤掉
					if (StateNode instanceof Element) {
						// 得到子节点的名字
						String childNodeName = StateNode.getNodeName();
						String StateName = ((Element) StateNode).getAttribute("Name");
						String StateCode = ((Element) StateNode).getAttribute("Code");
						System.out.print("====省或者直辖市名:" + StateName);
						System.out.println("----省者直辖市代号:" + StateCode);
					
						NodeList Citys = StateNode.getChildNodes();
						for (int z = 0; z < Citys.getLength(); z++) {
							Node CityNode = Citys.item(z);// 得到当前节点
							// 判断取出的值是否属于Element元素,目的是过滤掉
							if (CityNode instanceof Element) {
								// 得到子节点的名字

								String CityName = ((Element) CityNode).getAttribute("Name");
								String CityCode = ((Element) CityNode).getAttribute("Code");
								System.out.print("========城市名:" + CityName);
								System.out.println("----城市代号:" + CityCode);

							}
						}
				}
					}
				}
			

		return list;
	}

}

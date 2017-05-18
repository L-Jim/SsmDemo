package com.lzw.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.github.pagehelper.PageInfo;
import com.lzw.mapper.City;
import com.lzw.mapper.CityMapper;
import com.lzw.mapper.Country;
import com.lzw.mapper.CountryMapper;
import com.lzw.mapper.Provinces;
import com.lzw.mapper.ProvincesMapper;
import com.lzw.mapper.User;
import com.lzw.mapper.UserMapper;
import com.lzw.servers.UserServer;
import com.test.readXML;

@Controller
@RequestMapping("/add")
public class AddController {

	@Autowired
	ProvincesMapper provincesMapper;
	@Autowired
	CountryMapper countryMapper;
	@Autowired
	CityMapper cityMapper;
	
	@RequestMapping("/addall")
	public ModelAndView getuser()
	{
		ModelAndView mv = new ModelAndView("success");
		
		List<String> list;
		try {

			readXml("Location");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
		
	}
	
	public List<String> readXml(String node) throws Exception {
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

	public List<String> showElem(NodeList nl) {

		List<String> list = new ArrayList<String>();
		for (int i = 0; i < nl.getLength(); i++) {
			Node CountryNode = nl.item(i);// 得到当前节点
			if (CountryNode instanceof Element) {
				String CountryName = ((Element) CountryNode).getAttribute("Name");
				String CountryCode = ((Element) CountryNode).getAttribute("Code");
				System.out.print("国家名:" + CountryName);
				System.out.println("----国家代号:" + CountryCode);
				Country country=new Country(CountryName,CountryCode);
				countryMapper.insert(country);
				// CountryNode;
				// 子节点
			
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
						Provinces provinces=new Provinces(StateName, StateCode, CountryCode);
						provincesMapper.insert(provinces);
						NodeList Citys = StateNode.getChildNodes();
						for (int z = 0; z < Citys.getLength(); z++) {
							Node CityNode = Citys.item(z);// 得到当前节点
							// 判断取出的值是否属于Element元素,目的是过滤掉
							if (CityNode instanceof Element) {
								// 得到子节点的名字

								String CityName = ((Element) CityNode).getAttribute("Name");
								String CityCode = ((Element) CityNode).getAttribute("Code");
								City city = new City(CityName, CityCode, StateCode);
								System.out.print("========城市名:" + CityName);
								System.out.println("----城市代号:" + CityCode);
								cityMapper.insert(city);
							}
						}
				}
					}
				}
		}

		return list;
	}
}

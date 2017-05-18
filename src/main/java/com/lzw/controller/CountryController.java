package com.lzw.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.lzw.mapper.Country;
import com.lzw.servers.CountryServer;

@Controller
@RequestMapping("/country")
public class CountryController {

	@Autowired
	CountryServer countryServer;
	
//	@RequestMapping("/getcountrys")
//	public ModelAndView getAllCountrys(Integer i)
//	{
//		ModelAndView modelAndView =new ModelAndView("countrys");
//		PageInfo<Country> pageInfo = countryServer.getAllContry(i);
//		modelAndView.addObject("page",pageInfo);
//		return modelAndView;
//		
//	}
	
	@RequestMapping("/getcountrys")
	public String getAllCountrysa(Integer i,Map<String, Object> map)
	{
		PageInfo<Country> pageInfo = countryServer.getAllContry(i);
		map.put("page", pageInfo);
		return "countrys";
		
	}
}

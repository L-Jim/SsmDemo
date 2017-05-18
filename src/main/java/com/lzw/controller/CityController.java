package com.lzw.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.lzw.mapper.City;
import com.lzw.servers.CityServer;

@Controller
@RequestMapping("/city")
public class CityController {

	@Autowired
	CityServer cityServer;
	
	@RequestMapping("/getcitys")
	public String getAllCity(Integer pageNum, City city, Map<String, Object> map)
	{
	
		System.out.println(city);
		if(city==null)
		{
			System.out.println("city is null !");
		}
		pageNum = (pageNum==null||pageNum==0) ? 1:pageNum ;
//		PageInfo<City> pageInfo = cityServer.getAllCity(pageNum);
		PageInfo<City> pageInfo = cityServer.getAllCity(city, pageNum);
		map.put("page", pageInfo);
		map.put("city", city);
		return "citys";
	}
}

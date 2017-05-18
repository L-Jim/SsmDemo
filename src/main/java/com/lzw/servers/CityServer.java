package com.lzw.servers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzw.mapper.City;
import com.lzw.mapper.CityMapper;
import com.lzw.mapper.Country;

@Service
public class CityServer {

	@Autowired
	CityMapper cityMapper;
	
	public PageInfo getAllCity(Integer i)
	{
		PageHelper.startPage(i, 10);

		PageInfo<City> pageInfo = new PageInfo<City>(cityMapper.selectAll());
		return pageInfo;
		
	}
	public PageInfo getAllCity(City city,Integer i)
	{
		PageHelper.startPage(i, 10);
		
		PageInfo<City> pageInfo = new PageInfo<City>(cityMapper.selectByCity(city));
		return pageInfo;
		
	}
}

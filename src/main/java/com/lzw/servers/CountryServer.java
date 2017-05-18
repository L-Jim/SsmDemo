package com.lzw.servers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzw.mapper.Country;
import com.lzw.mapper.CountryMapper;

@Service
public class CountryServer {

	@Autowired
	CountryMapper countryMapper;
	
	
	public PageInfo<Country> getAllContry(Integer i)
	{
		PageHelper.startPage(i, 10);
		
		PageInfo<Country> pageInfo = new PageInfo<Country>(countryMapper.selectAll());
		return pageInfo;
	}
}

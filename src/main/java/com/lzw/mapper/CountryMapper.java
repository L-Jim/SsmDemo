package com.lzw.mapper;

import com.lzw.mapper.Country;
import java.util.List;

public interface CountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    int insert(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    Country selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    List<Country> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table country
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    int updateByPrimaryKey(Country record);
}
package com.lzw.mapper;

import com.lzw.mapper.Provinces;
import java.util.List;

public interface ProvincesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table provinces
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table provinces
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    int insert(Provinces record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table provinces
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    Provinces selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table provinces
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    List<Provinces> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table provinces
     *
     * @mbggenerated Mon May 15 10:54:14 GMT+08:00 2017
     */
    int updateByPrimaryKey(Provinces record);
}
package com.zy.official.dao.mapper;

import com.zy.official.dao.dataobject.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = 1")
    User getById();

}

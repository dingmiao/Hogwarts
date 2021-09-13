package com.gryffindor.dao.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.gryffindor.dao.entity.ArguementDO;
import org.springframework.stereotype.Repository;

/**
*  @author author
*/
@Mapper
@Repository
public interface ArguementDOBaseMapper {

    int insertArguementDO(ArguementDO object);

    int updateArguementDO(ArguementDO object);

    int update(ArguementDO.UpdateBuilder object);

    List<ArguementDO> queryArguementDO(ArguementDO object);

    ArguementDO queryArguementDOLimit1(ArguementDO object);

}
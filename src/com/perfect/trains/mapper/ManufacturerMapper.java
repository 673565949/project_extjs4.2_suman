package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.Manufacturer;
import com.perfect.trains.model.ManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManufacturerMapper extends BaseMapper {
    int countByExample(ManufacturerExample example);

    int deleteByExample(ManufacturerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Manufacturer record);

    int insertSelective(Manufacturer record);

    List<Manufacturer> selectByExample(ManufacturerExample example);

    Manufacturer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByExample(@Param("record") Manufacturer record, @Param("example") ManufacturerExample example);

    int updateByPrimaryKeySelective(Manufacturer record);

    int updateByPrimaryKey(Manufacturer record);
}
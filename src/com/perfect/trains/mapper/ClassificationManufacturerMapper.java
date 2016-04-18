package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.ClassificationManufacturer;
import com.perfect.trains.model.ClassificationManufacturerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationManufacturerMapper extends BaseMapper {
    int countByExample(ClassificationManufacturerExample example);

    int deleteByExample(ClassificationManufacturerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ClassificationManufacturer record);

    int insertSelective(ClassificationManufacturer record);

    List<ClassificationManufacturer> selectByExample(ClassificationManufacturerExample example);

    ClassificationManufacturer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ClassificationManufacturer record, @Param("example") ClassificationManufacturerExample example);

    int updateByExample(@Param("record") ClassificationManufacturer record, @Param("example") ClassificationManufacturerExample example);

    int updateByPrimaryKeySelective(ClassificationManufacturer record);

    int updateByPrimaryKey(ClassificationManufacturer record);
}
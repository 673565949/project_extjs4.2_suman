package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.EquipmentClassification;
import com.perfect.trains.model.EquipmentClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentClassificationMapper extends BaseMapper {
    int countByExample(EquipmentClassificationExample example);

    int deleteByExample(EquipmentClassificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EquipmentClassification record);

    int insertSelective(EquipmentClassification record);

    List<EquipmentClassification> selectByExample(EquipmentClassificationExample example);

    EquipmentClassification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EquipmentClassification record, @Param("example") EquipmentClassificationExample example);

    int updateByExample(@Param("record") EquipmentClassification record, @Param("example") EquipmentClassificationExample example);

    int updateByPrimaryKeySelective(EquipmentClassification record);

    int updateByPrimaryKey(EquipmentClassification record);
}
package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.TrainModelEquipmentClassification;
import com.perfect.trains.model.TrainModelEquipmentClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainModelEquipmentClassificationMapper extends BaseMapper {
    int countByExample(TrainModelEquipmentClassificationExample example);

    int deleteByExample(TrainModelEquipmentClassificationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainModelEquipmentClassification record);

    int insertSelective(TrainModelEquipmentClassification record);

    List<TrainModelEquipmentClassification> selectByExample(TrainModelEquipmentClassificationExample example);

    TrainModelEquipmentClassification selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainModelEquipmentClassification record, @Param("example") TrainModelEquipmentClassificationExample example);

    int updateByExample(@Param("record") TrainModelEquipmentClassification record, @Param("example") TrainModelEquipmentClassificationExample example);

    int updateByPrimaryKeySelective(TrainModelEquipmentClassification record);

    int updateByPrimaryKey(TrainModelEquipmentClassification record);
}
package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.TrainEquipment;
import com.perfect.trains.model.TrainEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainEquipmentMapper extends BaseMapper {
    int countByExample(TrainEquipmentExample example);

    int deleteByExample(TrainEquipmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainEquipment record);

    int insertSelective(TrainEquipment record);

    List<TrainEquipment> selectByExample(TrainEquipmentExample example);

    TrainEquipment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainEquipment record, @Param("example") TrainEquipmentExample example);

    int updateByExample(@Param("record") TrainEquipment record, @Param("example") TrainEquipmentExample example);

    int updateByPrimaryKeySelective(TrainEquipment record);

    int updateByPrimaryKey(TrainEquipment record);
}
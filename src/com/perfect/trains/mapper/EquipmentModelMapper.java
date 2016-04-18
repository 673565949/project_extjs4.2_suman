package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.EquipmentModel;
import com.perfect.trains.model.EquipmentModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentModelMapper extends BaseMapper {
    int countByExample(EquipmentModelExample example);

    int deleteByExample(EquipmentModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EquipmentModel record);

    int insertSelective(EquipmentModel record);

    List<EquipmentModel> selectByExample(EquipmentModelExample example);

    EquipmentModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EquipmentModel record, @Param("example") EquipmentModelExample example);

    int updateByExample(@Param("record") EquipmentModel record, @Param("example") EquipmentModelExample example);

    int updateByPrimaryKeySelective(EquipmentModel record);

    int updateByPrimaryKey(EquipmentModel record);
}
package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.EquipmentRepairRecord;
import com.perfect.trains.model.EquipmentRepairRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipmentRepairRecordMapper extends BaseMapper {
    int countByExample(EquipmentRepairRecordExample example);

    int deleteByExample(EquipmentRepairRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EquipmentRepairRecord record);

    int insertSelective(EquipmentRepairRecord record);

    List<EquipmentRepairRecord> selectByExample(EquipmentRepairRecordExample example);

    EquipmentRepairRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EquipmentRepairRecord record, @Param("example") EquipmentRepairRecordExample example);

    int updateByExample(@Param("record") EquipmentRepairRecord record, @Param("example") EquipmentRepairRecordExample example);

    int updateByPrimaryKeySelective(EquipmentRepairRecord record);

    int updateByPrimaryKey(EquipmentRepairRecord record);
}
package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.TrainRepairRecord;
import com.perfect.trains.model.TrainRepairRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainRepairRecordMapper extends BaseMapper {
    int countByExample(TrainRepairRecordExample example);

    int deleteByExample(TrainRepairRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainRepairRecord record);

    int insertSelective(TrainRepairRecord record);

    List<TrainRepairRecord> selectByExample(TrainRepairRecordExample example);

    TrainRepairRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainRepairRecord record, @Param("example") TrainRepairRecordExample example);

    int updateByExample(@Param("record") TrainRepairRecord record, @Param("example") TrainRepairRecordExample example);

    int updateByPrimaryKeySelective(TrainRepairRecord record);

    int updateByPrimaryKey(TrainRepairRecord record);
}
package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.TrainModel;
import com.perfect.trains.model.TrainModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainModelMapper extends BaseMapper {
    int countByExample(TrainModelExample example);

    int deleteByExample(TrainModelExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainModel record);

    int insertSelective(TrainModel record);

    List<TrainModel> selectByExample(TrainModelExample example);

    TrainModel selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TrainModel record, @Param("example") TrainModelExample example);

    int updateByExample(@Param("record") TrainModel record, @Param("example") TrainModelExample example);

    int updateByPrimaryKeySelective(TrainModel record);

    int updateByPrimaryKey(TrainModel record);
}
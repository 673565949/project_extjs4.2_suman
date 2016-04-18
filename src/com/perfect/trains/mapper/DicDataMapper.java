package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.DicData;
import com.perfect.trains.model.DicDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicDataMapper extends BaseMapper {
    int countByExample(DicDataExample example);

    int deleteByExample(DicDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DicData record);

    int insertSelective(DicData record);

    List<DicData> selectByExample(DicDataExample example);

    DicData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DicData record, @Param("example") DicDataExample example);

    int updateByExample(@Param("record") DicData record, @Param("example") DicDataExample example);

    int updateByPrimaryKeySelective(DicData record);

    int updateByPrimaryKey(DicData record);
}
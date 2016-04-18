package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.DicType;
import com.perfect.trains.model.DicTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicTypeMapper extends BaseMapper {
    int countByExample(DicTypeExample example);

    int deleteByExample(DicTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DicType record);

    int insertSelective(DicType record);

    List<DicType> selectByExample(DicTypeExample example);

    DicType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DicType record, @Param("example") DicTypeExample example);

    int updateByExample(@Param("record") DicType record, @Param("example") DicTypeExample example);

    int updateByPrimaryKeySelective(DicType record);

    int updateByPrimaryKey(DicType record);
}
package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.Parameter;
import com.perfect.trains.model.ParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParameterMapper extends BaseMapper {
    int countByExample(ParameterExample example);

    int deleteByExample(ParameterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Parameter record);

    int insertSelective(Parameter record);

    List<Parameter> selectByExample(ParameterExample example);

    Parameter selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Parameter record, @Param("example") ParameterExample example);

    int updateByExample(@Param("record") Parameter record, @Param("example") ParameterExample example);

    int updateByPrimaryKeySelective(Parameter record);

    int updateByPrimaryKey(Parameter record);
}
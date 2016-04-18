package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.RoleModule;
import com.perfect.trains.model.RoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleModuleMapper extends BaseMapper {
    int countByExample(RoleModuleExample example);

    int deleteByExample(RoleModuleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleModule record);

    int insertSelective(RoleModule record);

    List<RoleModule> selectByExample(RoleModuleExample example);

    RoleModule selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);

    int updateByExample(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);

    int updateByPrimaryKeySelective(RoleModule record);

    int updateByPrimaryKey(RoleModule record);
}
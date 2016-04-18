package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.RoleRoleGroup;
import com.perfect.trains.model.RoleRoleGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleRoleGroupMapper extends BaseMapper {
    int countByExample(RoleRoleGroupExample example);

    int deleteByExample(RoleRoleGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoleRoleGroup record);

    int insertSelective(RoleRoleGroup record);

    List<RoleRoleGroup> selectByExample(RoleRoleGroupExample example);

    RoleRoleGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoleRoleGroup record, @Param("example") RoleRoleGroupExample example);

    int updateByExample(@Param("record") RoleRoleGroup record, @Param("example") RoleRoleGroupExample example);

    int updateByPrimaryKeySelective(RoleRoleGroup record);

    int updateByPrimaryKey(RoleRoleGroup record);
}
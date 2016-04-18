package com.perfect.trains.mapper;

import com.perfect.trains.base.BaseMapper;
import com.perfect.trains.model.UserRoleGroup;
import com.perfect.trains.model.UserRoleGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRoleGroupMapper extends BaseMapper {
    int countByExample(UserRoleGroupExample example);

    int deleteByExample(UserRoleGroupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserRoleGroup record);

    int insertSelective(UserRoleGroup record);

    List<UserRoleGroup> selectByExample(UserRoleGroupExample example);

    UserRoleGroup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserRoleGroup record, @Param("example") UserRoleGroupExample example);

    int updateByExample(@Param("record") UserRoleGroup record, @Param("example") UserRoleGroupExample example);

    int updateByPrimaryKeySelective(UserRoleGroup record);

    int updateByPrimaryKey(UserRoleGroup record);
}
package com.sywwifi.api.dao;

import com.sywwifi.api.pojo.Gateway;
import com.sywwifi.api.pojo.GatewayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GatewayMapper {
    int countByExample(GatewayExample example);

    int deleteByExample(GatewayExample example);

    int deleteByPrimaryKey(Integer gatewayId);

    int insert(Gateway record);

    int insertSelective(Gateway record);

    List<Gateway> selectByExample(GatewayExample example);

    Gateway selectByPrimaryKey(Integer gatewayId);

    int updateByExampleSelective(@Param("record") Gateway record, @Param("example") GatewayExample example);

    int updateByExample(@Param("record") Gateway record, @Param("example") GatewayExample example);

    int updateByPrimaryKeySelective(Gateway record);

    int updateByPrimaryKey(Gateway record);
}
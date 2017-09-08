package com.sywwifi.api.dao;

import com.sywwifi.api.pojo.RechargeRecord;
import com.sywwifi.api.pojo.RechargeRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeRecordMapper {
    int countByExample(RechargeRecordExample example);

    int deleteByExample(RechargeRecordExample example);

    int deleteByPrimaryKey(String rechargeRecordId);

    int insert(RechargeRecord record);

    int insertSelective(RechargeRecord record);

    List<RechargeRecord> selectByExample(RechargeRecordExample example);

    RechargeRecord selectByPrimaryKey(String rechargeRecordId);

    int updateByExampleSelective(@Param("record") RechargeRecord record, @Param("example") RechargeRecordExample example);

    int updateByExample(@Param("record") RechargeRecord record, @Param("example") RechargeRecordExample example);

    int updateByPrimaryKeySelective(RechargeRecord record);

    int updateByPrimaryKey(RechargeRecord record);
}
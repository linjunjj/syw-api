package com.sywwifi.api.dao;

import com.sywwifi.api.pojo.SerialRecord;
import com.sywwifi.api.pojo.SerialRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SerialRecordMapper {
    int countByExample(SerialRecordExample example);

    int deleteByExample(SerialRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SerialRecord record);

    int insertSelective(SerialRecord record);

    List<SerialRecord> selectByExample(SerialRecordExample example);

    SerialRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SerialRecord record, @Param("example") SerialRecordExample example);

    int updateByExample(@Param("record") SerialRecord record, @Param("example") SerialRecordExample example);

    int updateByPrimaryKeySelective(SerialRecord record);

    int updateByPrimaryKey(SerialRecord record);
}
package com.sywwifi.api.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * ID 生成工具类测试
 *
 * @author 魏来 create on 2017/7/25
 * @version 1.0.0
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class IDUtilTest {
    @Test
    public void getId() throws Exception {
        String id = IDUtil.getId();
        log.info(id);
        Assert.assertNotNull(id);
    }

}
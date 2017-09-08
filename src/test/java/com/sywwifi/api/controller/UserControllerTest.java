package com.sywwifi.api.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * 用户控制器接口测试
 *
 * @author 魏来 create on 2017/7/25
 * @version 1.0.0
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class UserControllerTest {


    @Autowired
    private MockMvc mvc;

    @Test
    public void loginByPhone() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders
                        .post("/user/loginByPhone")
                        .param("phone", "18607097289")
                        .param("area", "测试区域")
        )
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void loginByUsername() throws Exception {
    }

    @Test
    public void registryUser() throws Exception {
        mvc.perform(MockMvcRequestBuilders.post("/user/registry"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
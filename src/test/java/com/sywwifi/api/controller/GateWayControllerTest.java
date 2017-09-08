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

import static org.junit.Assert.*;

/**
 * 网关接口控制器测试类
 *
 * @author 魏来 create on 2017/7/22
 * @version 1.0.0
 */
@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
public class GateWayControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void listGateway() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/gateways"))
                .andExpect(MockMvcResultMatchers.status().isOk())
        ;
    }

    @Test
    public void getByMac() throws Exception {
        mvc.perform(
                MockMvcRequestBuilders
                        .post("/gateway/mac")
                        .param("mac", "18:40:a4:ad:d2:3a")
        )
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
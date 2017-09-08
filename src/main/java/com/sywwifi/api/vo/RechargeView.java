package com.sywwifi.api.vo;

import com.sywwifi.api.pojo.Combo;
import com.sywwifi.api.pojo.User;
import lombok.Data;

import java.util.List;

/**
 * 充值视图对象
 *
 * @author 魏来 create on 2017/7/29
 * @version 1.0.0
 */
@Data
public class RechargeView {

    private User user;

    private List<Combo> comboList;
}

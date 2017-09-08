package com.sywwifi.api.base;

import com.sywwifi.api.commons.ResponseInfo;

import java.util.List;

/**
 * 服务接口基础类
 *
 * @param <Pojo> 实体对象
 * @param <ID>   实体对象ID类型
 */
public interface BaseService<Pojo, ID> {

    /**
     * 创建实体对象
     *
     * @param pojo 实体对象
     * @return 结果
     */
    ResponseInfo<Pojo> create(Pojo pojo);

    /**
     * 删除实体对象
     *
     * @param id 对象ID
     * @return 结果
     */
    ResponseInfo delete(ID id);

    /**
     * 更新接口对象
     *
     * @param pojo 实体对象
     * @return 结果
     */
    ResponseInfo<Pojo> update(Pojo pojo);

    /**
     * 获取对象根据ID
     *
     * @param id 对象ID
     * @return 结果
     */
    ResponseInfo<Pojo> getById(ID id);

    /**
     * 获取所有对象
     *
     * @return 结果
     */
    ResponseInfo<List<Pojo>> getAll();

}

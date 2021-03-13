package com.hh.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.gulimail.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-05 22:28:28
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


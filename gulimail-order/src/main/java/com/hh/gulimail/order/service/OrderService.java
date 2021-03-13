package com.hh.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-17 09:46:57
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


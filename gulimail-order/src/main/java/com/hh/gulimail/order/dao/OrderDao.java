package com.hh.gulimail.order.dao;

import com.hh.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-17 09:46:57
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

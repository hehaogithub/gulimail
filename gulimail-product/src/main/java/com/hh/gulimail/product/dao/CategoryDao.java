package com.hh.gulimail.product.dao;

import com.hh.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-05 22:28:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

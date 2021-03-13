package com.hh.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.gulimail.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-05 22:28:28
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


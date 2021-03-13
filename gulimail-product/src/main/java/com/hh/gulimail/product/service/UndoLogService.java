package com.hh.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.gulimail.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-05 22:28:27
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


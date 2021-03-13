package com.hh.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.gulimail.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-17 09:26:08
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.hh.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.gulimail.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-17 09:26:09
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


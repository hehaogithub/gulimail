package com.hh.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hh.common.utils.PageUtils;
import com.hh.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-17 09:26:08
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


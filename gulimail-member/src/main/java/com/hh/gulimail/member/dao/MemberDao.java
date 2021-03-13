package com.hh.gulimail.member.dao;

import com.hh.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hehao
 * @email 1757300860@qq.com
 * @date 2021-02-17 09:26:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

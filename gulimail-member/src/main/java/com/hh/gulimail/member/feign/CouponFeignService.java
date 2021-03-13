package com.hh.gulimail.member.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hh.common.utils.R;
@FeignClient("gulimail-coupon")
public interface CouponFeignService {
    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();
}

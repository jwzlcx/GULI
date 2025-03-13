package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author jzc
 * @email 2575939509@qq.com
 * @date 2025-03-12 20:45:28
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


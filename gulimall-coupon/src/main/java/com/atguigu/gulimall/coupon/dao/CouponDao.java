package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jzc
 * @email 2575939509@qq.com
 * @date 2025-03-12 20:45:28
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

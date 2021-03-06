package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.SpuInfoDescEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息介绍
 * 
 * @author Jesse
 * @email Jesse@atguigu.com
 * @date 2019-08-01 21:54:13
 */
@Mapper
public interface SpuInfoDescDao extends BaseMapper<SpuInfoDescEntity> {

    void insertInfo(@Param("spuInfoDescEntity") SpuInfoDescEntity spuInfoDescEntity);
}

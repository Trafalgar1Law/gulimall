package com.atguigu.gulimall.pms.service;

import com.atguigu.gulimall.commons.bean.Resp;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.CategoryEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;

import java.util.List;


/**
 * 商品三级分类
 *
 * @author Jesse
 * @email Jesse@atguigu.com
 * @date 2019-08-01 21:54:13
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageVo queryPage(QueryCondition params);

    List<CategoryEntity> getCategoryByLevel(Integer level);

    List<CategoryEntity> getCategoryTreeById(Integer catId);
}


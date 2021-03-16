package com.hh.gulimail.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hh.common.utils.PageUtils;
import com.hh.common.utils.Query;

import com.hh.gulimail.product.dao.CategoryDao;
import com.hh.gulimail.product.entity.CategoryEntity;
import com.hh.gulimail.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entityList=baseMapper.selectList(null);
        List<CategoryEntity> level1Menus=entityList.stream().filter(
                categoryEntity->categoryEntity.getParentCid()==0
        ).map(menu->{
            menu.setChildren(getChildrens(menu,entityList));
            return menu;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return level1Menus;
    }
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
       List<CategoryEntity> children=all.stream()
               .filter(menu->menu.getParentCid()==root.getCatId())
               .map(menu ->{
                   menu.setChildren(getChildrens(menu,all));
                   return menu;
               })
               .sorted((menu1,menu2)-> {
                   return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());
               }).collect(Collectors.toList());

        return children;
    }
}
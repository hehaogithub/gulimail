package com.hh.gulimail.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hh.gulimail.product.entity.BrandEntity;
import com.hh.gulimail.product.service.BrandService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.*;
import java.util.List;

@SpringBootTest
class GulimailProductApplicationTests {
   @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        //BrandEntity be=new BrandEntity();
        //be.setBrandId(8L);
        //be.setDescript("华为描述");
        //brandService.save(be);
        //System.out.println("保存成功");
        //brandService.updateById(be);
        List<BrandEntity> brandEntityList=brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",1));
        brandEntityList.forEach((item)->{
            System.out.println(item);
        });
    }

}

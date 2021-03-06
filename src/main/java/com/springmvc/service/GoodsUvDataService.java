package com.springmvc.service;

import com.springmvc.pojo.Goodsuvdata;
import org.springframework.stereotype.Service;


public interface GoodsUvDataService  extends  BaseService<Goodsuvdata>{
    /**
     * Description： 定时更新总的uv
     * @author boyang
     * @date 2019/3/26 14:00
     * @param
     * @return
     */

    Integer unCountUv();
    /**
     * Description：定时清空uv
     * @author boyang
     * @date 2019/4/2 13:45
     * @param
     * @return
     */
    Integer deleUv();
}

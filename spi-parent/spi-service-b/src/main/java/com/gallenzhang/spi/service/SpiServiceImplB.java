package com.gallenzhang.spi.service;

import com.gallenzhang.spi.SpiService;
/**
 * @author : zhangxq
 * @date : 2019/01/25
 * @description :
 */
public class SpiServiceImplB implements SpiService {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "! from service-b");
    }
}

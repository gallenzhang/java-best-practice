package com.gallenzhang.spi.service;

import com.gallenzhang.spi.SpiService;

/**
 * @author : zhangxq
 * @date : 2019/01/25
 * @description :
 */
public class SpiServiceImplA implements SpiService {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "! from service-a");
    }
}

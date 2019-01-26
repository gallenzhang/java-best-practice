package com.gallenzhang.spi;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author : zhangxq
 * @date : 2019/01/25
 * @description :Spi测试类
 */
public class SpiMain {
    public static void main(String[] args) throws SQLException {
        ServiceLoader<SpiService> loadedParsers = ServiceLoader.load(SpiService.class);
        Iterator<SpiService> iterator = loadedParsers.iterator();
        while (iterator.hasNext()){
            SpiService spiService = iterator.next();
            spiService.sayHello("gallenzhang");
        }
    }
}

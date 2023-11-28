package com.lezhi.demo;

import org.junit.jupiter.api.Test;

/**
 * @Auther: 罗罗娜
 * @Date: 2023/11/28-11-28-10:45
 * @Description：com.lezhi.demo
 */
public class test {
    @Test
    public void t(){

        for (int i = 0; i < 20; i++) {
            double a = Math.random()*4+1;
            System.out.print(a+" ");
        }

    }
}

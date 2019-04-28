package com.zhang.api.service;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 张宏运
 * @Date: 2019-04-18 8:58
 * 与项目无关，仅作Java学习
 */

public class Test {
    public static void main(String[] args)  {
        String hello = "hello";
        if (hello == null) {
            if (hello != null) {
                if (hello != null) {

                }
            }
        }
        List<String> list = Arrays.asList("1","2","3");
        for (String s : list) {
            for (String s1 : list) {
                for (int i = 0; i < list.size(); i++) {
                    for (int i1 = list.size() - 1; i1 >= 0; i1--) {
                        
                    }
                }
            }
        }
        new X();//XYYX
    }
}

class X extends Y{
    {
        System.out.print("X-初始代码块");
    }
    X(){
        System.out.print("X-Constructor");
    }
}
class Y{
    {
        System.out.print("Y-初始代码块");
    }
    Y(){
        System.out.print("Y-Constructor");
    }
}


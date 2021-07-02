package com.lt.java8.strream.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Tony.L
 * @version ：2020 Version：1.0
 * @create ：2020/07/22 11:23
 */
public class Q8 {
    public static void main(String[] args) {
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for (String name : names) {
            runners.add(() -> System.out.println(name));
        }
        for (Runnable runner : runners) {
            new Thread(runner).start();
        }

    }
}

package com.lt.java8.strream.chapter1.defaultmethod;

/**
 * @author ：Tony.L
 * @version ：2020 Version：1.0
 * @create ：2020/12/08 22:51
 */
public interface Person {
    default void getName() {
        System.out.println("person");
    }
}

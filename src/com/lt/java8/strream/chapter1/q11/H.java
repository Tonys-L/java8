package com.lt.java8.strream.chapter1.q11;

import java.util.stream.Stream;

/**
 * @author ：Tony.L
 * @version ：2020 Version：1.0
 * @create ：2020/07/22 11:48
 */
public class H extends K implements J,I {


    public static void main(String[] args) {
        H h = new H();
        I j = h;
        h.f();
        j.f();
        Stream.of("1", "2");
    }
}

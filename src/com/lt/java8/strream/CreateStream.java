package com.lt.java8.strream;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author ：Tony.L
 * @version ：2018 Version：1.0
 * @create ：2018/12/03 15:30
 */
public class CreateStream {
    public static void main(String[] args) {
        /**
         * 通过静态方法Stream.of创建
         */
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5", "6");

        /**
         * 通过Arrays.stream创建
         */
        Stream<String> stream1 = Arrays.stream(new String[]{"1", "2", "3", "4", "5", "6"});

        /**
         * 创建空的stream
         */

        Stream<String> stream2 = Stream.empty();

        /**
         * 无限Stream，使用Stream.generate来创建。可以随时从里面取值
         */
        Stream<String> stream3 = Stream.generate(() -> "123");

        Stream<Double> stream4 = Stream.generate(Math::random);
        /**
         * 创建0，1，2，3，4。。。。的无限序列
         */
        Stream<BigInteger> stream5 = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
        System.out.println(stream5.filter(n->n.intValue()>0).findFirst().get().intValue());

    }
}

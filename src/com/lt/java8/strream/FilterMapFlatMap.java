package com.lt.java8.strream;

import java.util.stream.Stream;

/**
 * @author ：Tony.L
 * @version ：2018 Version：1.0
 * @create ：2018/12/03 16:04
 */
public class FilterMapFlatMap {
    public static void main(String[] args) {
        String[] str = new String[]{"1", "2", "3", "4", "5", "6", "7", "8"};

        Stream<String> stream = Stream.of(str);
        /**
         * 把一个流转换为另一个流
         */
        Stream<String> stringStream = stream.filter(s -> s.equals("2"));

        /**
         * limit用于截取指定长度的流
         */
        Stream<Double> stream1 = Stream.generate(Math::random).limit(100);

        /**
         * skip用于跳过指定长度的元素
         */
        Stream<Double> stream2 = Stream.generate(Math::random).skip(2).limit(5);

        /**
         * 连接两个流
         */
        Stream<Double> stream3 = Stream.concat(stream1, stream2);

        Object[] objects = Stream.iterate(1, p -> p * 2).peek(e -> System.out.println("fetch" + e)).limit(20).toArray();

    }
}

package com.lt.java8.strream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @author ：Tony.L
 * @version ：2018 Version：1.0
 * @create ：2018/12/03 14:48
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "/java8.iml")), StandardCharsets.UTF_8);
        System.out.println(content);
        List<String> words = Arrays.asList(content.split("[\\P{L}]+"));
        int count = 0;
        for (String word : words) {
            System.out.println(word);
            if (word.length() > 12) {
                count++;
            }
        }

        long c = words.stream().filter(word ->
                word.length() > 12
        ).count();

        //并行计算
        long cc = words.parallelStream().filter(word -> {
            System.out.println("=====" + Thread.currentThread().getId());
            return word.length() > 12;
        }).count();

        System.out.println(count);

        System.out.println(c);

        System.out.println(cc);
    }
}

package com.lt.java8.strream.chapter1;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * @author ：Tony.L
 * @version ：2020 Version：1.0
 * @create ：2020/12/08 22:31
 */
public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\tree1.txt");

        Iterable<Path> ps = path.getFileSystem().getRootDirectories();
        Iterator<Path> pathIterator = ps.iterator();
        while (pathIterator.hasNext()) {
            System.out.println(pathIterator.next().getNameCount());
        }
    }
}

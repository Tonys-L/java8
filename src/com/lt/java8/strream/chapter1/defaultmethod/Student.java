package com.lt.java8.strream.chapter1.defaultmethod;

/**
 * @author ：Tony.L
 * @version ：2020 Version：1.0
 * @create ：2020/12/08 22:52
 */
public class Student implements Person,Named{
    /**
     * 如果Person，Named 两个接口中都有 默认实现的getName方法，Student 要显式的覆盖getName方法
     * 如果 Named中没有提getName供默认实现，只提供 getName 方法的声明，Student 还是要显示的覆盖getName方法
     * 如果Person ，Named 两个接口都只是声明了 getName方法，那么Student要么实现getName方法，要么是个抽象类
     * 如果Student 继承的父类里也存在getName方法，那么只有父类中的getName方法会起作用，这就是 “类优先”规则
     */
    @Override
    public void getName() {
        Person.super.getName();
    }
}

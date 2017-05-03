package com.shj.basejavademo.keyword.keyword.abstractdemo;

/**
 * Created by Reus on 2017/5/3.
 * 抽象类可以被继承吗？ yes
 * 抽象类中可以有不抽象的方法吗 yes
 * 抽象类中的抽象方法一定要被子类重写
 */

public abstract class Demo1 {
    public Demo1(){

    }
    public void getName(){

    }
    public abstract void getAge();
    //不可以被子类覆盖，但可以被继承
    public final void getHight(){

    }
}

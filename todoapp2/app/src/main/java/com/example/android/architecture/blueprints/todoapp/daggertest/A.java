package com.example.android.architecture.blueprints.todoapp.daggertest;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm19930215@163.com
 * @since 2018/10/19 下午2:45
 **/
public class A {

    private B b;

    public A(B b){
        this.b = b;
    }
    public void eat() {
        System.out.print("吃饭了");
    }
}

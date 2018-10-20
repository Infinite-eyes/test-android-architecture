package com.example.android.architecture.blueprints.todoapp.daggertest;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/20 下午10:52
 **/
public class Apple {

    public Color color;

    @Inject
    public Apple(Color color) {
        this.color = color;
    }



    public void print() {
        Log.d("TAG","This is an apple");
    }
}

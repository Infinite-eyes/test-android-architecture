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

    @Inject
    public Apple() {

    }

    public void print() {
        Log.d("TAG","This is an apple");
    }
}

package com.example.android.architecture.blueprints.todoapp.daggertest;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 下午9:20
 **/
public class MainPresenter {

    @Inject
    public MainPresenter(){

    }

    public void print(){
        Log.d("TAG", "This is a MainPresenter");
    }

}

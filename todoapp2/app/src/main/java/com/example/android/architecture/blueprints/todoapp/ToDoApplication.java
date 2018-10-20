package com.example.android.architecture.blueprints.todoapp;


import com.example.android.architecture.blueprints.todoapp.di.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/20 下午7:07
 **/
public class ToDoApplication extends DaggerApplication {


    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
//        return DaggerAppComponent.builder().application(this).build();
//        return null;
        return DaggerAppComponent.create();
    }
}

package com.example.android.architecture.blueprints.todoapp;


import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * des
 * https://google.github.io/dagger/android
 * https://google.github.io/dagger/users-guide
 *
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 下午9:23
 **/
public class App extends Application  {

//    @Inject
//    DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
    }

//    @Override
//    public AndroidInjector<Activity> activityInjector() {
//        return dispatchingActivityInjector;
//    }
}

package com.example.android.architecture.blueprints.todoapp;


import android.support.v4.app.Fragment;

import com.example.android.architecture.blueprints.todoapp.daggertest.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 下午9:23
 **/
public class App  extends DaggerApplication  {

//    @Inject
//    DispatchingAndroidInjector<Fragment> fragmentSupportInjector;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.create();
    }
//    @Override
//    public AndroidInjector<Fragment> supportFragmentInjector() {
//        return fragmentSupportInjector;
//    }
}

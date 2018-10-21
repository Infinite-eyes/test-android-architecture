package com.example.android.architecture.blueprints.todoapp.daggertest;

import android.app.Activity;
import android.app.Application;

import com.example.android.architecture.blueprints.todoapp.App;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 下午9:27
 **/

@Component(modules =  {
        ActivityModule.class,
        AndroidSupportInjectionModule.class,
        AndroidInjectionModule.class
})
public interface AppComponent extends AndroidInjector<App> {
}

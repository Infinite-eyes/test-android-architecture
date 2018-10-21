package com.example.android.architecture.blueprints.todoapp.daggertest;

import com.example.android.architecture.blueprints.todoapp.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 下午9:31
 **/
@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();

}

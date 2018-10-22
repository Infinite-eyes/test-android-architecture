package com.example.android.architecture.blueprints.todoapp;

import com.example.android.architecture.blueprints.todoapp.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 下午11:34
 **/
@Subcomponent
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

}

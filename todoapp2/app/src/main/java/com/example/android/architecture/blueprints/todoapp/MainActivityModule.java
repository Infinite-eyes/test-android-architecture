package com.example.android.architecture.blueprints.todoapp;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 下午11:38
 **/
//@Module(subcomponents = MainActivitySubcomponent.class)
@Module
abstract class MainActivityModule {
//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity>
//    bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);

    //    @ActivityScope
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivityInjector();


}

package com.example.android.architecture.blueprints.todoapp.daggertest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 上午11:40
 **/
@Module
public class VegetableModule {


    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ProvideTomato {
    }

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ProvidePotato {
    }

    @Singleton
    @Provides
    @ProvideTomato
    Vegetable provideTomato() {
        return new Tomato();
    }

    @Provides
    @ProvidePotato
    Vegetable providePotato() {
        return new Potato();
    }


}

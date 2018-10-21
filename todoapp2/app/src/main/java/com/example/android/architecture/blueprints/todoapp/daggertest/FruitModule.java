package com.example.android.architecture.blueprints.todoapp.daggertest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Named;
import javax.inject.Qualifier;

import dagger.Module;
import dagger.Provides;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 上午12:15
 **/
@Module
public class FruitModule {

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ProvideBanana{};


    @Provides
    @ProvideApple
    Fruit provideApple(){
        return new Apple();
    }

    @Provides
    @ProvideBanana
    Fruit provideBanana(){
        return new Banana();
    }
}

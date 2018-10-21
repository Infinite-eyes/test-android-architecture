package com.example.android.architecture.blueprints.todoapp.daggertest;

import javax.inject.Named;

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

    @Provides
    @Named("Apple")
    Fruit provideApple(){
        return new Apple();
    }

    @Provides
    @Named("Banana")
    Fruit provideBanana(){
        return new Banana();
    }
}

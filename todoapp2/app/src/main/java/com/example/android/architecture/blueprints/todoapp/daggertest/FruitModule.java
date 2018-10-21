package com.example.android.architecture.blueprints.todoapp.daggertest;

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
    Fruit provideFruit(){
        return new Apple();
    }


}

package com.example.android.architecture.blueprints.todoapp.daggertest;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm19930215@163.com
 * @since 2018/10/19 下午2:45
 **/
@Module
public class MainModule {


    @Provides
    @Named("Apple")
    B providerB(){
        return new B();
    }


    @Provides
    A providerA(B b){
        return new A(b);
    }

}
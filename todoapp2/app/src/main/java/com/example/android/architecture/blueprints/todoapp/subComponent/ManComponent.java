package com.example.android.architecture.blueprints.todoapp.subComponent;

import dagger.Component;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午2:26
 **/
@MyScope
@Component(modules = CarModule.class)
public interface ManComponent {
    void injectMan(Man man);

//    Car car();
}



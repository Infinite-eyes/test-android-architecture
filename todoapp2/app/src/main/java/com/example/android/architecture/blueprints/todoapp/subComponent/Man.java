package com.example.android.architecture.blueprints.todoapp.subComponent;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午2:25
 **/
public class Man {
//    @Inject
//    @Named("car1")
//    Lazy<Car> lazyCar;

    @Inject
    @Named("car1")
    Car car;

    @Inject
    @Named("car2")
    Car car2;

    public void goWork() {
        DaggerManComponent.create().injectMan(this);
//        lazyCar.get().go(); // lazyCar.get() 返回 Car 实例

        car.go();
    }
}

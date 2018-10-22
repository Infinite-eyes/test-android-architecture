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

    ManComponent manComponent;
    @Inject
    @Named("car1")
   public Car car1;

    @Inject
    @Named("car2")
    public Car car2;


    public Man() {
        manComponent = DaggerManComponent.create();
        manComponent.injectMan(this);
    }

    public ManComponent getManComponent() {
        manComponent = DaggerManComponent.create();
        return manComponent;
    }

    public void goWork() {
//        lazyCar.get().go(); // lazyCar.get() 返回 Car 实例

        car1.go();
    }
}

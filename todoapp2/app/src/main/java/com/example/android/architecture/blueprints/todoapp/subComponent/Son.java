package com.example.android.architecture.blueprints.todoapp.subComponent;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午4:39
 **/
public class Son {


    SonComponent sonComponent;

    @Inject
    @Named("car1")
    Car car;


    @Inject
    Bike bike;

    public Son() {
        ManComponent manComponent = DaggerManComponent.builder()
                .build();

        SonComponent sonComponent = manComponent.subcomponents()
                .build();
        sonComponent.inject(this);

    }


}

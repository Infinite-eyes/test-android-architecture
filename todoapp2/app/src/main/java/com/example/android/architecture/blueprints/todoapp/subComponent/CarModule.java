package com.example.android.architecture.blueprints.todoapp.subComponent;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午2:33
 **/
@Module(subcomponents = SonComponent.class)
public class CarModule {
    @Provides
//    @MyScope
//    @FriendScope
    @Named("car1")
    Car provideCar1() {
        return new Car();
    }

    //    @FriendScope
    @Provides
    @Named("car2")
    Car provideCar2() {
        return new Car();
    }

}

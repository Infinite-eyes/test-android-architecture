package com.example.android.architecture.blueprints.todoapp.subComponent;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午4:42
 **/
@Module
public class BikeModule {

    @Provides
    Bike provideBike() {
        return new Bike();
    }

}

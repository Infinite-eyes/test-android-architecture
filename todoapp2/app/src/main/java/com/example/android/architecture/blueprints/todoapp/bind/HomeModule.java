package com.example.android.architecture.blueprints.todoapp.bind;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/23 12:00 PM
 **/
@Module
public abstract class HomeModule {
//    @Provides
//    public HomePresenter providesHomePresenter(){
//        return new HomePresenterImp();
//    }


    @Binds
    public abstract HomePresenter bindHomePresenter(HomePresenterImp homePresenterImp);

}

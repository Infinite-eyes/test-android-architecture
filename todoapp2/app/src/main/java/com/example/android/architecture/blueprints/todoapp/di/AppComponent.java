package com.example.android.architecture.blueprints.todoapp.di;

import android.app.Application;

import com.example.android.architecture.blueprints.todoapp.ToDoApplication;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepositoryModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/20 下午7:37
 **/
@Singleton
@Component(modules =  {TasksRepositoryModule.class,
        ApplicationModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<ToDoApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }


}

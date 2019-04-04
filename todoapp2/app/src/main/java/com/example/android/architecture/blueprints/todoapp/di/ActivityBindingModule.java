package com.example.android.architecture.blueprints.todoapp.di;

import com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity;
import com.example.android.architecture.blueprints.todoapp.tasks.TasksModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/20 下午7:13
 **/
@Module
public abstract class ActivityBindingModule {

//    @ActivityScoped
    @ContributesAndroidInjector(modules = TasksModule.class)
    abstract TasksActivity tasksActivity();

}

package com.example.android.architecture.blueprints.todoapp;


import android.support.annotation.VisibleForTesting;

import com.example.android.architecture.blueprints.todoapp.data.Task;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;
import com.example.android.architecture.blueprints.todoapp.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/20 下午7:07
 **/
public class ToDoApplication extends DaggerApplication {

    @Inject
    TasksRepository tasksRepository;

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
//        return null;
//        return DaggerAppComponent.create();
    }

    @VisibleForTesting
    public TasksRepository getTasksRepository() {
        return tasksRepository;
    }
}

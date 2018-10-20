package com.example.android.architecture.blueprints.todoapp.tasks;

import com.example.android.architecture.blueprints.todoapp.di.ActivityScoped;
import com.example.android.architecture.blueprints.todoapp.di.FragmentScoped;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/20 下午7:20
 **/
@Module
public abstract class TasksModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract TasksFragment tasksFragment();


    @ActivityScoped
    @Binds abstract TasksContract.Presenter taskPresenter(TasksPresenter presenter);


}

package com.example.android.architecture.blueprints.todoapp.data.source;

import android.app.Application;
import android.arch.persistence.room.Room;


import com.example.android.architecture.blueprints.todoapp.data.FakeTasksRemoteDataSource;
import com.example.android.architecture.blueprints.todoapp.data.Task;
import com.example.android.architecture.blueprints.todoapp.data.source.local.TasksDao;
import com.example.android.architecture.blueprints.todoapp.data.source.local.TasksLocalDataSource;
import com.example.android.architecture.blueprints.todoapp.data.source.local.ToDoDatabase;
import com.example.android.architecture.blueprints.todoapp.utils.AppExecutors;
import com.example.android.architecture.blueprints.todoapp.utils.DiskIOThreadExecutor;

import java.lang.annotation.Retention;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/26 11:01 AM
 **/
@Module
public abstract class TasksRepositoryModule {

    private static final int THREAD_COUNT = 3;

    @Singleton
    @Binds
    @Local
    abstract TasksDataSource provideTasksLocalDataSource(TasksLocalDataSource dataSource);

    @Singleton
    @Binds
    @Remote
    abstract TasksDataSource provideTaskRemoteDataSource(FakeTasksRemoteDataSource dataSource);




    @Singleton
    @Provides
    static ToDoDatabase provideDb(Application context) {
        return Room.databaseBuilder(context.getApplicationContext(), ToDoDatabase.class, "Tasks.db")
                .build();
    }


    @Singleton
    @Provides
    static TasksDao provideTaskDao(ToDoDatabase db){
        return db.taskDao();
    }

    @Singleton
    @Provides
    static AppExecutors provideAppExecutors(){
        return new AppExecutors(new DiskIOThreadExecutor(),
                Executors.newFixedThreadPool(THREAD_COUNT),
                new AppExecutors.MainThreadExecutor());
    }




}

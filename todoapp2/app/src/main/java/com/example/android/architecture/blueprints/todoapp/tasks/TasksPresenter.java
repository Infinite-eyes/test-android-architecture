package com.example.android.architecture.blueprints.todoapp.tasks;

import android.support.annotation.NonNull;

import com.example.android.architecture.blueprints.todoapp.data.Task;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksRepository;
import com.example.android.architecture.blueprints.todoapp.di.ActivityScoped;

import javax.inject.Inject;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/20 下午6:32
 **/
@ActivityScoped
public class TasksPresenter implements TasksContract.Presenter {

    private  TasksRepository mTasksRepository;

    TasksPresenter(TasksRepository tasksRepository){
        mTasksRepository = tasksRepository;
    }

    @Inject
    TasksPresenter(){
    }

    private TasksFilterType mCurrentFiltering = TasksFilterType.ACTIVE_TASKS;

    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public void loadTasks(boolean forceUpdate) {

    }

    @Override
    public void addNewTask() {

    }

    @Override
    public void openTaskDetails(@NonNull Task requestedTask) {

    }

    @Override
    public void completeTask(@NonNull Task completedTask) {

    }

    @Override
    public void activateTask(@NonNull Task activeTask) {

    }

    @Override
    public void clearCompletedTasks() {

    }

    @Override
    public TasksFilterType getFiltering() {
        return mCurrentFiltering;
    }

    @Override
    public void setFiltering(TasksFilterType requestType) {

    }

    @Override
    public void takeView(TasksContract.View view) {

    }

    @Override
    public void dropView() {

    }
}

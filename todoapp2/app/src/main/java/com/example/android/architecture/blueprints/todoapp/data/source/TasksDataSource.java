package com.example.android.architecture.blueprints.todoapp.data.source;

import android.support.annotation.NonNull;

import com.example.android.architecture.blueprints.todoapp.data.Task;

import java.util.List;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/19 下午7:22
 **/
public interface TasksDataSource {

    interface LoadTasksCallback{

        void onTasksLoaded(List<Task> tasks);

        void onDataNotAvailable();
    }

    interface GetTaskCallback{
        void onTaskLoaded(Task task);

        void  onDataNotAvailable();
    }

    void getTasks(@NonNull LoadTasksCallback callback);

    void getTask(@NonNull String taskId, @NonNull GetTaskCallback callback);

    void saveTask(@NonNull Task task);

    void completeTask(@NonNull Task task);

    void completeTask(@NonNull String taskId);

    void activateTask(@NonNull Task task);

    void activateTask(@NonNull String taskId);

    void clearCompletedTasks();

    void refreshTasks();

    void deleteAllTasks();

    void deleteTask(@NonNull String taskId);

}

package com.example.android.architecture.blueprints.todoapp.data;

import android.support.annotation.NonNull;

import com.example.android.architecture.blueprints.todoapp.data.source.TasksDataSource;
import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.inject.Inject;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/26 3:13 PM
 **/
public class FakeTasksRemoteDataSource implements TasksDataSource {

    private static final Map<String, Task> TASKS_SERVICE_DATA = new LinkedHashMap<>();

    @Inject
    public FakeTasksRemoteDataSource(){}

    @Override
    public void getTasks(@NonNull LoadTasksCallback callback) {
            callback.onTasksLoaded(Lists.newArrayList(TASKS_SERVICE_DATA.values()));
    }

    @Override
    public void getTask(@NonNull String taskId, @NonNull GetTaskCallback callback) {
        Task task = TASKS_SERVICE_DATA.get(taskId);
        callback.onTaskLoaded(task);
    }

    @Override
    public void saveTask(@NonNull Task task) {
        TASKS_SERVICE_DATA.put(task.getId(),task);
    }

    @Override
    public void completeTask(@NonNull Task task) {
        Task completedTask = new Task(task.getTitle(), task.getDescription(),task.getId(),true);
        TASKS_SERVICE_DATA.put(task.getId(), completedTask);
    }

    @Override
    public void completeTask(@NonNull String taskId) {
    }

    @Override
    public void activateTask(@NonNull Task task) {
        Task activeTask = new Task(task.getTitle(), task.getDescription(), task.getId());
        TASKS_SERVICE_DATA.put(task.getId(), activeTask);
    }

    @Override
    public void activateTask(@NonNull String taskId) {
    }

    @Override
    public void clearCompletedTasks() {
        Iterator<Map.Entry<String, Task>> it = TASKS_SERVICE_DATA.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Task> entry = it.next();
            if (entry.getValue().isCompleted()) {
                it.remove();
            }
        }
    }

    @Override
    public void refreshTasks() {

    }

    @Override
    public void deleteAllTasks() {
        TASKS_SERVICE_DATA.clear();
    }

    @Override
    public void deleteTask(@NonNull String taskId) {
        TASKS_SERVICE_DATA.remove(taskId);
    }


}

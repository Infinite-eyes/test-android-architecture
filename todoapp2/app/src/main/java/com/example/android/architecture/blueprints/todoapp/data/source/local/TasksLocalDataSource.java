package com.example.android.architecture.blueprints.todoapp.data.source.local;

import android.support.annotation.NonNull;

import com.example.android.architecture.blueprints.todoapp.data.Task;
import com.example.android.architecture.blueprints.todoapp.data.source.TasksDataSource;
import com.example.android.architecture.blueprints.todoapp.utils.AppExecutors;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/26 2:35 PM
 **/
@Singleton
public class TasksLocalDataSource implements TasksDataSource {

    private final TasksDao mTasksDao;

    private final AppExecutors mAppExecutors;

    @Inject
    public TasksLocalDataSource(@NonNull AppExecutors executors,@NonNull TasksDao tasksDao){
        mTasksDao = tasksDao;
        mAppExecutors = executors;
    }

    @Override
    public void getTasks(@NonNull final LoadTasksCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final List<Task> tasks = mTasksDao.getTasks();
                mAppExecutors.mainThread().execute(new Runnable() {
                    @Override
                    public void run() {
                        if(tasks.isEmpty()){
                            callback.onDataNotAvailable();
                        }else{
                            callback.onTasksLoaded(tasks);
                        }
                    }
                });
            }
        };
        mAppExecutors.diskIO().execute(runnable);
    }

    @Override
    public void getTask(@NonNull final String taskId, @NonNull final GetTaskCallback callback) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    final Task task = mTasksDao.getTaskById(taskId);
                    mAppExecutors.mainThread().execute(new Runnable() {
                        @Override
                        public void run() {
                           if(task!= null){
                               callback.onTaskLoaded(task);
                           }else{
                               callback.onDataNotAvailable();
                           }
                        }
                    });

                }
            };
            mAppExecutors.diskIO().execute(runnable);
    }

    @Override
    public void saveTask(@NonNull final Task task) {
        checkNotNull(task);
        Runnable saveRunnable = new Runnable() {
            @Override
            public void run() {
                mTasksDao.insertTask(task);
            }
        };
        mAppExecutors.diskIO().execute(saveRunnable);
    }

    @Override
    public void completeTask(@NonNull final Task task) {
        Runnable completeRunnable = new Runnable() {
            @Override
            public void run() {
                mTasksDao.updateCompleted(task.getId(),true);
            }
        };
        mAppExecutors.diskIO().execute(completeRunnable);
    }

    @Override
    public void completeTask(@NonNull final String taskId) {

    }

    @Override
    public void activateTask(@NonNull Task task) {

    }

    @Override
    public void activateTask(@NonNull String taskId) {

    }

    @Override
    public void clearCompletedTasks() {
        Runnable clearTasksRunnable = new Runnable() {
            @Override
            public void run() {
                mTasksDao.deleteCompletedTasks();
            }
        };
        mAppExecutors.diskIO().execute(clearTasksRunnable);
    }

    @Override
    public void refreshTasks() {

    }

    @Override
    public void deleteAllTasks() {
        Runnable deleteRunable = new Runnable() {
            @Override
            public void run() {
                mTasksDao.deleteTasks();
            }
        };
        mAppExecutors.diskIO().execute(deleteRunable);
    }

    @Override
    public void deleteTask(@NonNull final String taskId) {
        Runnable deleteRunnable = new Runnable() {
            @Override
            public void run() {
                mTasksDao.deleteTaskById(taskId);
            }
        };
        mAppExecutors.diskIO().execute(deleteRunnable);
    }
}

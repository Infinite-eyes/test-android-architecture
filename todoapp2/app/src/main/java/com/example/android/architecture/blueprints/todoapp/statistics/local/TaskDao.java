package com.example.android.architecture.blueprints.todoapp.statistics.local;

import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.android.architecture.blueprints.todoapp.data.Task;

import java.util.List;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/19 下午7:08
 **/
public interface TaskDao {


    @Query("SELECT * FROM Tasks")
    List<Task> getTasks();

    @Query("SELECT * FROM tasks WHERE entryid =:taskId")
    Task getTaskById(String taskId);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTask(Task task);

    @Update
    int updateTask(Task task);

    @Query("UPDATE tasks SET completed = :completed WHERE entryid =:taskId")
    void updateCompleted(String taskId, boolean completed);


    @Query("DELETE FROM tasks WHERE entryid =:taskId")
    int deleteTaskById(String taskId);


    @Query("DELETE FROM tasks")
    void deleteTasks();

    @Query("DELETE FROM Tasks WHERE completed = 1")
    int deleteCompletedTasks();


}

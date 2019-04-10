package com.example.android.architecture.blueprints.todoapp.data.source.local;

import com.example.android.architecture.blueprints.todoapp.data.Task;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2019/4/4 3:02 PM
 **/
@Dao
public interface TasksDao {


    @Query("SELECT * FROM Tasks")
    List<Task> getTasks();

    @Query("SELECT * FROM Tasks WHERE entryid = :taskId")
    Task getTaskById(String taskId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertTask(Task task);

    @Update
    int updateTask(Task task);

    @Query("UPDATE tasks SET completed = :completed WHERE entryid= :taskId")
    void updateCompleted(String taskId, boolean completed);

    @Query("DELETE FROM tasks WHERE entryid = :taskId")
    int deleteTaskById(String taskId);

    @Query("DELETE FROM Tasks")
    void deleteTasks();

    @Query("DELETE FROM tasks WHERE completed = 1")
    int deleteCompletedTasks();

}

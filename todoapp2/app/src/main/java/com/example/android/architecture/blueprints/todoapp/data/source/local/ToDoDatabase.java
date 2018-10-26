package com.example.android.architecture.blueprints.todoapp.data.source.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.android.architecture.blueprints.todoapp.data.Task;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/19 下午7:06
 **/
@Database(entities = {Task.class}, version = 1)
public abstract class ToDoDatabase extends RoomDatabase {
    public abstract TasksDao taskDao();
}

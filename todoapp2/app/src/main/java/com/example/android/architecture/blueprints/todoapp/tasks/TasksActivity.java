package com.example.android.architecture.blueprints.todoapp.tasks;

import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2019/4/4 11:01 AM
 **/
public class TasksActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasks_act);


    }
}

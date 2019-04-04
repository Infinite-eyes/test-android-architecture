package com.example.android.architecture.blueprints.todoapp.taskdetail;

import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.R;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2019/4/4 11:24 AM
 **/
public class TaskDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taskdetail_act);
    }


}

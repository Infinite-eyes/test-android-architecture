package com.example.android.architecture.blueprints.todoapp.addedittask;

import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.R;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2019/4/4 11:20 AM
 **/
public class AddEditTaskActivity extends AppCompatActivity {

    public static final int REQUEST_ADD_TASK = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtask_act);
    }


}

package com.example.android.architecture.blueprints.todoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.example.android.architecture.blueprints.todoapp.subComponent.Man;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Man man;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        man = new Man();
        man.goWork();
    }
}

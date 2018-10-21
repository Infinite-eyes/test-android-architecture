package com.example.android.architecture.blueprints.todoapp;

import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.daggertest.MainPresenter;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mainPresenter.print();

    }
}

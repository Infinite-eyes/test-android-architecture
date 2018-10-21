package com.example.android.architecture.blueprints.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.daggertest.A;
import com.example.android.architecture.blueprints.todoapp.daggertest.Apple;
import com.example.android.architecture.blueprints.todoapp.daggertest.Fruit;
import com.example.android.architecture.blueprints.todoapp.daggertest.FruitModule;

import javax.inject.Inject;

import dagger.Component;


public class MainActivity extends AppCompatActivity {

    @Inject
    Fruit apple;

    @Component(modules = FruitModule.class)
    interface MainActivityComponent{
        void inject(MainActivity activity);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActivity_MainActivityComponent.create().inject(this);

        apple.print();
    }
}

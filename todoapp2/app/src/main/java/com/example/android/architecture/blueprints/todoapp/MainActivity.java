package com.example.android.architecture.blueprints.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.daggertest.A;
import com.example.android.architecture.blueprints.todoapp.daggertest.Apple;
import com.example.android.architecture.blueprints.todoapp.daggertest.DaggerMainComponent;
import com.example.android.architecture.blueprints.todoapp.daggertest.Fruit;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //    @Inject
//    A a;

    
    // right
    private Fruit apple;

    @Inject
    public void setApple(Apple apple) {
        this.apple = apple;
    }
    //wrong
//    @Inject
//    private Fruit apple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent.create().inject(this);

        apple.print();
//        a.eat();
    }
}

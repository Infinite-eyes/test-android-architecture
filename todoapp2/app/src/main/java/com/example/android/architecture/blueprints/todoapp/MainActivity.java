package com.example.android.architecture.blueprints.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.architecture.blueprints.todoapp.daggertest.A;
import com.example.android.architecture.blueprints.todoapp.daggertest.Apple;
import com.example.android.architecture.blueprints.todoapp.daggertest.BaseComponent;
import com.example.android.architecture.blueprints.todoapp.daggertest.MainPresenter;
import com.example.android.architecture.blueprints.todoapp.daggertest.ProvideApple;
import com.example.android.architecture.blueprints.todoapp.daggertest.Vegetable;
import com.example.android.architecture.blueprints.todoapp.daggertest.VegetableModule;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Component;
import dagger.Subcomponent;
import dagger.android.support.DaggerAppCompatActivity;


public class MainActivity extends DaggerAppCompatActivity {

//    @Inject
//    @ProvideApple
//    Fruit apple;
//
//    @Inject
//    @FruitModule.ProvideBanana
//    public Fruit banana;

//    @Inject
//    @VegetableModule.ProvideTomato
//    Vegetable tomato;
//
//    @Inject
//    @VegetableModule.ProvideTomato
//    Vegetable tomato2;
//
//    @Inject
//    @VegetableModule.ProvidePotato
//    Vegetable potato;
//
//
//    @Subcomponent(modules = FruitModule.class)
//    public interface MainActivityComponent {
//        void inject(MainActivity activity);
//    }

    @Inject  //现在只要简单的声明即可注入
    MainPresenter mainPresenter;
//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        mainPresenter.print();
//        DaggerMainActivity_MainActivityComponent.create().inject(this);

//        DaggerMainActivity_MainActivityComponent.builder()
//                .baseComponent(DaggerBaseComponent.create())
//                .build()
//                .inject(this);

//        DaggerBaseComponent.create().plus().inject(this);

//        tomato.print();
//        potato.print();

//        apple.print();
//        banana.print();
    }
}

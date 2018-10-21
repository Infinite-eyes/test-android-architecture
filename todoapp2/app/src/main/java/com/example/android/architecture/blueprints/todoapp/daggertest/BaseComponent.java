package com.example.android.architecture.blueprints.todoapp.daggertest;

import dagger.Component;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 上午11:50
 **/
@Component(modules = VegetableModule.class)
public interface BaseComponent {

    @VegetableModule.ProvideTomato
    Vegetable getTomato();

    @VegetableModule.ProvidePotato
    Vegetable getPotato();


}

package com.example.android.architecture.blueprints.todoapp;

import dagger.Component;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 下午11:46
 **/
@Component(modules = {MainActivityModule.class})
interface MainApplicationComponent {
    void inject(App app);
}

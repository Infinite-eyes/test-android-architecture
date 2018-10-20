package com.example.android.architecture.blueprints.todoapp;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm19930215@163.com
 * @since 2018/10/19 下午5:50
 **/
public interface BasePresenter<T> {

    void takeView(T view);

    void dropView();
}

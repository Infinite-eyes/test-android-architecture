package com.example.android.architecture.blueprints.todoapp;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2019/4/4 11:56 AM
 **/
public interface BaseView<T> {
    void setPresenter(T presenter);
}

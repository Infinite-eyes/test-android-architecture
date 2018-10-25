package com.example.android.architecture.blueprints.todoapp.bind;

import java.util.List;

import javax.inject.Inject;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/23 11:59 AM
 **/
public class HomePresenterImp implements HomePresenter {

    Banana banana;

    @Inject
    public HomePresenterImp(Banana banana) {
        this.banana = banana;
    }

    @Override
    public Banana loadBanana() {
        //Return user list observable
        return banana;
    }
}

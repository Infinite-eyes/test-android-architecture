package com.example.android.architecture.blueprints.todoapp.statistics;

import android.view.View;

import com.example.android.architecture.blueprints.todoapp.BasePresenter;
import com.example.android.architecture.blueprints.todoapp.BaseView;

import dagger.android.DaggerFragment;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm19930215@163.com
 * @since 2018/10/19 下午5:49
 **/
public class StatisticsContract  {

    interface View extends BaseView<Presenter>{

        void setProgressIndicator(boolean active);

        void showStatistics(int numberOfIncompleteTasks, int numberOfCompletedTasks);

        void showLoadingStatisticsError();

        boolean isActive();
    }


    interface Presenter extends BasePresenter<View>{}

}

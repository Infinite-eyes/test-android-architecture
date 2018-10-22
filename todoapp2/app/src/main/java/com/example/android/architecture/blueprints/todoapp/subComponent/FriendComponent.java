package com.example.android.architecture.blueprints.todoapp.subComponent;

import dagger.Component;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午3:05
 **/
@FriendScope
@Component(modules = CarModule.class)
public interface FriendComponent {
    void injectMan(Friend friend);
}

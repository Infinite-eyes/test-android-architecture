package com.example.android.architecture.blueprints.todoapp.subComponent;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午2:26
 **/
public class Friend {
    @Inject
    @Named("car1")
    public Car car1;    // 车是向 Man 借的

    public Friend(ManComponent manComponent) {
        DaggerFriendComponent.builder().manComponent(manComponent).build().injectMan(this);
    }

    public void goSightseeing() {
        car1.go();
    }
}

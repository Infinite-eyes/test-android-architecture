package com.example.android.architecture.blueprints.todoapp.subComponent;

import dagger.Subcomponent;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午4:41
 **/
@SonScope
@Subcomponent(modules = BikeModule.class)
public interface SonComponent {
    void inject(Son son);

    @Subcomponent.Builder
    interface Builder { // SubComponent 必须显式地声明 Subcomponent.Builder，parent Component 需要用 Builder 来创建 SubComponent
        SonComponent build();
    }
}

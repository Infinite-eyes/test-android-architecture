package com.example.android.architecture.blueprints.todoapp.daggertest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/21 上午10:44
 **/
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ProvideApple {

}

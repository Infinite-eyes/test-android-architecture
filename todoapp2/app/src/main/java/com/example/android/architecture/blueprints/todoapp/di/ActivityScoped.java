package com.example.android.architecture.blueprints.todoapp.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/20 下午7:26
 **/
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScoped {
}

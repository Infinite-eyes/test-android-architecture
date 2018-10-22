package com.example.android.architecture.blueprints.todoapp.subComponent;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2018/10/22 下午2:27
 **/
@Documented
@Retention(RUNTIME)
@Scope
public @interface MyScope {
}

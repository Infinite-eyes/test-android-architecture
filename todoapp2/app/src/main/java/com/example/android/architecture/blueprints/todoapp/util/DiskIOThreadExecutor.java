package com.example.android.architecture.blueprints.todoapp.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @author chenweiming
 * @version 1.0
 * @mail cwm930215@gmail.com
 * @since 2019/4/4 4:06 PM
 **/
public class DiskIOThreadExecutor implements Executor {

    private final Executor mDiskIO;

    public DiskIOThreadExecutor(){
        mDiskIO = Executors.newSingleThreadExecutor();
    }

    @Override
    public void execute(Runnable command) {
      mDiskIO.execute(command);
    }
}

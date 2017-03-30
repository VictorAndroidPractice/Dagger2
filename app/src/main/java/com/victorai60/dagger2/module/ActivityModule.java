package com.victorai60.dagger2.module;

import android.app.Activity;

import com.victorai60.dagger2.scope.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @author Victor
 * @date 2016-05-28 22:16
 */
@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @PerActivity
    public Activity provideActivity() {
        return activity;
    }
}

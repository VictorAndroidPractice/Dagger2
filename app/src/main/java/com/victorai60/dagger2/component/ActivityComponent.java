package com.victorai60.dagger2.component;

import android.app.Activity;

import com.victorai60.dagger2.module.ActivityModule;
import com.victorai60.dagger2.scope.PerActivity;

import dagger.Component;

/**
 * @author Victor
 * @date 2016-05-28 22:16
 */
@PerActivity
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
}

package com.victorai60.dagger2.component;

import com.victorai60.dagger2.MainActivity;
import com.victorai60.dagger2.module.ActivityModule;
import com.victorai60.dagger2.module.MainModule;
import com.victorai60.dagger2.scope.PerActivity;

import dagger.Component;

/**
 * @author Victor
 * @date 2016-05-28 22:18
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = {MainModule.class, ActivityModule.class})
public interface MainComponent extends ActivityComponent {
    void inject(MainActivity mainActivity);
}

package com.victorai60.dagger2.component;

import android.location.LocationManager;

import com.victorai60.dagger2.Dagger2Application;
import com.victorai60.dagger2.MainActivity;
import com.victorai60.dagger2.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Victor
 * @date 2016-05-28 17:20
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(Dagger2Application application);
    void inject(MainActivity mainActivity);
    LocationManager getLocationManager();
}

package com.victorai60.dagger2.module;

import android.content.Context;
import android.location.LocationManager;

import com.victorai60.dagger2.Dagger2Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Victor
 * @date 2016-05-28 17:21
 */
@Module
public class AppModule {
    private Dagger2Application application;

    public AppModule(Dagger2Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Dagger2Application provideApplicationContext() {
        return application;
    }

    @Provides
    @Singleton
    public LocationManager provideLocationManager() {
        return (LocationManager) application.getSystemService(Context.LOCATION_SERVICE);
    }
}

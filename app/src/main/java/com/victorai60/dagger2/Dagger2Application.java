package com.victorai60.dagger2;

import android.app.Application;
import android.content.Context;
import android.location.LocationManager;
import android.support.multidex.MultiDex;
import android.util.Log;

import com.victorai60.dagger2.component.AppComponent;
import com.victorai60.dagger2.component.DaggerAppComponent;
import com.victorai60.dagger2.module.AppModule;

import javax.inject.Inject;

/**
 * @author Victor
 * @date 2016-05-28 17:17
 */
public class Dagger2Application extends Application {
    private static final String TAG = "Dagger2Application";

    @Inject
    LocationManager locationManager;
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
        getAppComponent().inject(this);
        Log.d(TAG, locationManager.toString());
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}

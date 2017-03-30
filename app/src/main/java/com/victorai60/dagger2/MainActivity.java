package com.victorai60.dagger2;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.victorai60.dagger2.component.AppComponent;
import com.victorai60.dagger2.component.DaggerMainComponent;
import com.victorai60.dagger2.component.MainComponent;
import com.victorai60.dagger2.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    protected LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = ((Dagger2Application) getApplication()).getAppComponent();
        appComponent.inject(this);
        System.out.println(locationManager.toString());
        System.out.println(appComponent.getLocationManager());
        MainComponent mainComponent = DaggerMainComponent.builder().appComponent(appComponent)
                .activityModule(new ActivityModule(this)).build();
        System.out.println(mainComponent.getActivity());
    }
}

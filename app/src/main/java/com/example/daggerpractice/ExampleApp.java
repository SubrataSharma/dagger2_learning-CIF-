package com.example.daggerpractice;

import android.app.Application;

import com.example.daggerpractice.dagger.CarComponent;
import com.example.daggerpractice.dagger.DaggerCarComponent;

public class ExampleApp extends Application {
    private CarComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component= DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(1300)
                .build();
    }

    public CarComponent getAppComponent(){
        return component;
    }
}

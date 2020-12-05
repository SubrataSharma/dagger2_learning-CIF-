package com.example.daggerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerpractice.car.Car;
import com.example.daggerpractice.dagger.CarComponent;
import com.example.daggerpractice.dagger.DaggerCarComponent;
import com.example.daggerpractice.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component=((ExampleApp) getApplication()).getAppComponent();
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
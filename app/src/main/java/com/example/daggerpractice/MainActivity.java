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
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component= DaggerCarComponent.builder()
                .horsePower(100)
                .engineCapacity(1300)
                .build();
        component.inject(this);
        car.drive();
    }
}
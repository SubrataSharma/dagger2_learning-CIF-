package com.example.daggerpractice.dagger;

import com.example.daggerpractice.car.DieselEngine;
import com.example.daggerpractice.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return horsePower;
    }
    @Provides
     Engine provideEngine(DieselEngine dieselEngine) {
        return dieselEngine;
    }
}

package com.example.daggerpractice.dagger;

import com.example.daggerpractice.car.Engine;
import com.example.daggerpractice.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine petrolEngine);
}

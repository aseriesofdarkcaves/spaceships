package com.asodc.spaceships;

import com.asodc.spaceships.module.ModuleConfiguration;

public abstract class Ship implements ModularShip {
    protected String name;
    protected ModuleConfiguration moduleConfiguration;

    protected Ship(String name) {
        this.name = name;
        this.moduleConfiguration = new ModuleConfiguration();

        initDefaultModuleConfiguration();
    }
}

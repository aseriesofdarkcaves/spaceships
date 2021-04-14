package com.asodc.spaceships;

import com.asodc.spaceships.module.*;

public class IntrepidClass extends Ship {
    public IntrepidClass(String name) {
        super(name);
    }

    public ModuleConfiguration getInitialModuleConfiguration() {
        ModuleConfiguration moduleConfiguration = new ModuleConfiguration();

        moduleConfiguration.add(new CargoBay(10));
        moduleConfiguration.add(new Engine());
        moduleConfiguration.add(new Generator());
        moduleConfiguration.add(new LifeSupport());
        moduleConfiguration.add(new Sensor());
        moduleConfiguration.add(new Shield());
        moduleConfiguration.add(new Weapon());

        return moduleConfiguration;
    }
}

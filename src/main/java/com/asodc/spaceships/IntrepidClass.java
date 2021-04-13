package com.asodc.spaceships;

import com.asodc.spaceships.module.*;

import java.util.ArrayList;
import java.util.List;

public class IntrepidClass extends Ship {
    public IntrepidClass(String name) {
        super(name);
    }

    // TODO: find out the pros and cons of using the interface
    //  vs. passing an instance of ModuleConfiguration to the superclass
    public void initDefaultModuleConfiguration() {
        CargoBay cargoBay = new CargoBay(10);
        Engine engine = new Engine();
        Generator generator = new Generator();
        LifeSupport lifeSupport = new LifeSupport();
        Sensor sensor = new Sensor();
        Shield shield = new Shield();
        Weapon weapon = new Weapon();

        List<Module> modules = new ArrayList<>();
        modules.add(cargoBay);
        modules.add(engine);
        modules.add(generator);
        modules.add(lifeSupport);
        modules.add(sensor);
        modules.add(shield);
        modules.add(weapon);

        moduleConfiguration.setModules(modules);
    }
}

package com.asodc.spaceships;

import com.asodc.spaceships.module.*;

public class IntrepidClass extends Ship {
    private CargoBay cargoBay;
    private Engine engine;
    private Generator generator;
    private LifeSupport lifeSupport;
    private Sensor sensor;
    private Shield shield;
    private Weapon weapon;

    public IntrepidClass(String name) {
        super(name);
        initModules();
    }

    private void initModules() {
        cargoBay = new CargoBay(10);
        engine = new Engine();
        generator = new Generator();
        lifeSupport = new LifeSupport();
        sensor = new Sensor();
        shield = new Shield();
        weapon = new Weapon();
    }
}

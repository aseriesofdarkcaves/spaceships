package com.asodc.spaceships;

import com.asodc.spaceships.module.*;

public class IntrepidClass extends Ship {
    // could move these to Ship
    // but then every Ship would only be able to have one of each of these Modules
    // it would allow some fields to be null if they didn't have that module
    // then Ship would contain the methods for accessing the fields
    // What about client usage?
    // do I expect to have to access the modules before manipulating them?
    //  playerShip.getCargoBay().add(new Cargo(Cargo.Item.BEANS, 10));
    // or should the modules be configurable directly via Ship methods?
    //  playerShip.addCargo(new Cargo(Cargo.Item.BEANS, 10));
    // What about this
    //  playerShip.addCargo(Cargo.Item.BEANS, 10); - addCargo would need to handle the Cargo object
    //  playerShip.getCargoAmount(Cargo.Item.BEANS); - this would return an int
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

        modules.add(cargoBay);
        modules.add(engine);
        modules.add(generator);
        modules.add(lifeSupport);
        modules.add(sensor);
        modules.add(shield);
        modules.add(weapon);
    }
}

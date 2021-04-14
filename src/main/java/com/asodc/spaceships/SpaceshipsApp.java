package com.asodc.spaceships;

import com.asodc.spaceships.module.ModuleConfiguration;
import com.jme3.app.SimpleApplication;

public class SpaceshipsApp extends SimpleApplication {
    private Ship playerShip;

    public static void main(String... args) {
        new SpaceshipsApp().start();
    }

    @Override
    public void simpleInitApp() {
        initShip();
    }

    @Override
    public void simpleUpdate(float tpf) {
        ModuleConfiguration moduleConfiguration = playerShip.getInitialModuleConfiguration();
    }

    private void initShip() {
        playerShip = new IntrepidClass("Intrepid");
    }
}

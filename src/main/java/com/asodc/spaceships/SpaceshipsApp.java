package com.asodc.spaceships;

import com.jme3.app.SimpleApplication;
import com.jme3.light.PointLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

public class SpaceshipsApp extends SimpleApplication {
    private Geometry player;
    private Ship playerShip;
    private PointLight shipPointLight = new PointLight();

    private static final String COLOR_PROP = "Color";
    private static final String PLAYER_ID = "player";

    private SpaceshipsApp() {
        // don't want multiple instances
    }

    @Override
    public void simpleInitApp() {
        configureFlyCam();
        initShip();
        initShipInterior();
        initShipTerminals();
        initLighting();
        initPlayer();
    }

    @Override
    public void simpleUpdate(float tpf) {
        // TODO: update stuff
        player.rotate(0f, tpf, 0f);
    }

    public static void main(String... args) {
        new SpaceshipsApp().start();
    }

    private void configureFlyCam() {
        flyCam.setMoveSpeed(10f);
    }

    private void initShip() {
        playerShip = new IntrepidClass("Intrepid");
    }

    private void initShipInterior() {
        Spatial shipInterior = assetManager.loadModel("intrepid-interior.obj");

        rootNode.attachChild(shipInterior);
    }

    private void initShipTerminals() {
        // TODO: import the various terminals that allow player interaction
    }

    private void initLighting() {
        shipPointLight = new PointLight();
        shipPointLight.setColor(ColorRGBA.White);
        shipPointLight.setRadius(100f);
        shipPointLight.setPosition(new Vector3f(0f, 5f, 0f));

        rootNode.addLight(shipPointLight);
    }

    private void initPlayer() {
        Material playerMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");

        player = (Geometry) assetManager.loadModel("player.obj");
        player.setMaterial(playerMaterial);
        player.setLocalTranslation(3f, 3f, 0f);

        rootNode.attachChild(player);
    }
}

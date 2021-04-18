package com.asodc.spaceships;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Box;

public class SpaceshipsApp extends SimpleApplication {
    private Geometry player;
    private Ship playerShip;

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
        DirectionalLight sun = new DirectionalLight();
        sun.setColor(ColorRGBA.White);
        sun.setDirection(new Vector3f(-0.5f, -0.5f, -0.5f));
        rootNode.addLight(sun);
    }

    private void initPlayer() {
        // TODO: create a player model in blender, export it to obj and import it here
        Material playerMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        playerMaterial.setColor(COLOR_PROP, ColorRGBA.Blue);

        Box playerMesh = new Box(0.5f, 0.5f, 0.5f);

        player = new Geometry(PLAYER_ID, playerMesh);
        player.setMaterial(playerMaterial);
        // TODO: attach the cam to the player?

        rootNode.attachChild(player);
    }
}

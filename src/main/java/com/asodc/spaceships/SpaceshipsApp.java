package com.asodc.spaceships;

import com.jme3.app.SimpleApplication;
import com.jme3.light.PointLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;
import com.jme3.system.AppSettings;

/**
 * Spaceships application entry-point.
 */
public class SpaceshipsApp extends SimpleApplication {
    /**
     * The player's current ship.
     */
    private Ship playerShip;
    /**
     * The player.
     */
    private Spatial player;
    /**
     * The console at the front.
     */
    private Spatial helmConsole;
    /**
     * The left console.
     */
    private Spatial portConsole;
    /**
     * The right console.
     */
    private Spatial starboardConsole;
    /**
     * The ship's interior lighting.
     */
    private PointLight shipPointLight = new PointLight();

    // TODO: figure out why I put these here (for reuse, but I currently don't use them for anything)
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
        initShipConsoles();
        initLighting();
        initPlayer();
    }

    @Override
    public void simpleUpdate(float tpf) {
        // TODO: implement the game loop
        player.rotate(0f, tpf, 0f);
    }

    public static void main(String... args) {
        AppSettings appSettings = new AppSettings(true);
        appSettings.setTitle("Spaceships");
        appSettings.setResolution(1280, 720);

        SpaceshipsApp app = new SpaceshipsApp();
        app.setShowSettings(false);
        app.setSettings(appSettings);
        app.start();
    }

    private void configureFlyCam() {
        // TODO: remove the flycam and implement FPS movement for the player
        flyCam.setMoveSpeed(10f);
        cam.setLocation(new Vector3f(0f, 5f, 9f));
    }

    private void initShip() {
        playerShip = new IntrepidClass("Intrepid");
    }

    private void initShipInterior() {
        Spatial shipInterior = assetManager.loadModel("intrepid-interior.obj");

        rootNode.attachChild(shipInterior);
    }

    private void initShipConsoles() {
        helmConsole = assetManager.loadModel("console.obj");
        portConsole = assetManager.loadModel("console.obj");
        starboardConsole = assetManager.loadModel("console.obj");

        helmConsole.setLocalTranslation(0f, 0f, -6f);
        portConsole.setLocalTranslation(-4f, 0f, 0f);
        starboardConsole.setLocalTranslation(4f, 0f, 0f);

        rootNode.attachChild(helmConsole);
        rootNode.attachChild(portConsole);
        rootNode.attachChild(starboardConsole);
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

        player = assetManager.loadModel("player.obj");
        player.setMaterial(playerMaterial);
        player.setLocalTranslation(0f, 2f, 0f);

        rootNode.attachChild(player);
    }
}

package com.asodc.spaceships;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class SpaceshipsApp extends SimpleApplication {
    private Geometry player;
    private Ship playerShip;

    public static void main(String... args) {
        new SpaceshipsApp().start();
    }

    @Override
    public void simpleInitApp() {
        initScene();
        initPlayer();
        initShip();
    }

    private void initScene() {
        // TODO: set up the inside of the ship
        // TODO: create a floor
        // TODO: create walls
        // TODO: create ship terminals
    }

    private void initPlayer() {
        // TODO: set up everything to do with the player object and 1st person camera?
        Material playerMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        playerMaterial.setColor("Color", ColorRGBA.Blue);

        Box playerMesh = new Box(1f, 1f, 1f);

        player = new Geometry("player", playerMesh);
        player.setMaterial(playerMaterial);

        rootNode.attachChild(player);
    }

    @Override
    public void simpleUpdate(float tpf) {
        // TODO: update stuff
    }

    private void initShip() {
        playerShip = new IntrepidClass("Intrepid");
    }
}

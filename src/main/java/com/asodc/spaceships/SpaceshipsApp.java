package com.asodc.spaceships;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.*;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.scene.shape.Quad;

public class SpaceshipsApp extends SimpleApplication {
    private Geometry player;
    private Ship playerShip;

    private static final Vector3f PLAYER_INITIAL_POSITION = new Vector3f(2f, 2f, -2f);
    private static final Quad FLOOR = new Quad(10f, 20f);

    private SpaceshipsApp() {
        // don't want multiple instances
    }

    public static void main(String... args) {
        new SpaceshipsApp().start();
    }

    @Override
    public void simpleInitApp() {
        initShipInterior();
        initPlayer();
        initShip();
    }

    private void initShipInterior() {
        // the floor starts at origin and is rotated so that it becomes a plane on the x-axis
        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        material.setColor("Color", ColorRGBA.Red);

        Geometry geometry = new Geometry("floor", FLOOR);
        geometry.setMaterial(material);

        // rotates the plane 90 degrees around the x-axis away from the initial camera
        geometry.rotate(-FastMath.PI / 2, 0f, 0f);

        rootNode.attachChild(geometry);

        // TODO: create walls

        // TODO: create ship terminals
    }

    private void initPlayer() {
        Material playerMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        playerMaterial.setColor("Color", ColorRGBA.Blue);

        Box playerMesh = new Box(1f, 1f, 1f);

        player = new Geometry("player", playerMesh);
        player.setMaterial(playerMaterial);
        player.setLocalTranslation(PLAYER_INITIAL_POSITION);
        // TODO: attach the cam to the player?

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

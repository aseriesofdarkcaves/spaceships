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

    private static final String COLOR_PROP = "Color";

    private static final Quad FLOOR_MESH = new Quad(10f, 20f);
    private static final Quad PORT_WALL_MESH = new Quad(20f, 10f);
    private static final Quad STARBOARD_WALL_MESH = new Quad(20f, 10f);

    private static final String PLAYER_ID = "player";
    private static final Vector3f PLAYER_INITIAL_POSITION = new Vector3f(2f, 2f, -2f);

    private SpaceshipsApp() {
        // don't want multiple instances
    }

    public static void main(String... args) {
        new SpaceshipsApp().start();
    }

    @Override
    public void simpleInitApp() {
        configureFlyCam();
        initShipInterior();
        initPlayer();
        initShip();
    }

    private void configureFlyCam() {
        flyCam.setMoveSpeed(10f);
    }

    private void initShipInterior() {
        // floor starts at origin and is rotated so that it becomes a plane on the x-axis
        Material floorMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        floorMaterial.setColor(COLOR_PROP, ColorRGBA.Red);

        Geometry floor = new Geometry("floor", FLOOR_MESH);
        floor.setMaterial(floorMaterial);
        // rotate negative 90 degrees around the x-axis
        floor.rotate(-FastMath.PI / 2, 0f, 0f);

        rootNode.attachChild(floor);

        // TODO: try import the blender intrepid-interior scene thing

        // left port wall
        Material portWallMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        portWallMaterial.setColor(COLOR_PROP, ColorRGBA.Cyan);

        Geometry portWall = new Geometry("portWall", PORT_WALL_MESH);
        portWall.setMaterial(portWallMaterial);
        // rotate 90 degrees around the y-axis
        portWall.rotate(0f, FastMath.PI / 2, 0f);

        rootNode.attachChild(portWall);

        // right starboard wall
        Material starboardWallMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        starboardWallMaterial.setColor(COLOR_PROP, ColorRGBA.Green);

        Geometry starboardWall = new Geometry("starboardWall", STARBOARD_WALL_MESH);
        starboardWall.setMaterial(starboardWallMaterial);
        // rotate 90 degrees around the y-axis
        starboardWall.rotate(0f, -FastMath.PI / 2, 0f);
        starboardWall.setLocalTranslation(10f, 0f, -20f);

        rootNode.attachChild(starboardWall);

        // TODO: create ship terminals
    }

    private void initPlayer() {
        Material playerMaterial = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        playerMaterial.setColor(COLOR_PROP, ColorRGBA.Blue);

        Box playerMesh = new Box(1f, 1f, 1f);

        player = new Geometry(PLAYER_ID, playerMesh);
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

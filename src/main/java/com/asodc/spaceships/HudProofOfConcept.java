package com.asodc.spaceships;

import com.jme3.app.SimpleApplication;
import com.jme3.ui.Picture;

public class HudProofOfConcept extends SimpleApplication {
    @Override
    public void simpleInitApp() {
        configureFlyCam();
        initGui();
    }

    private void configureFlyCam() {
        flyCam.setEnabled(false);
    }

    private void initGui() {
        Picture picture = new Picture("pic");
        picture.setImage(assetManager, "Textures/ColoredTex/Monkey.png", true);
        picture.setWidth(settings.getWidth() / 2f);
        picture.setHeight(settings.getHeight() / 2f);
        picture.setPosition(settings.getWidth() / 4f, settings.getHeight() / 4f);

        guiNode.attachChild(picture);
    }

    public static void main(String... args) {
        new HudProofOfConcept().start();
    }
}

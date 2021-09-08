package com.asodc.spaceships;

import com.asodc.spaceships.module.ModuleConfiguration;

/**
 * Base class that all ships should extend.
 */
public abstract class Ship implements ModularShip {
    /**
     * The name of the Ship.
     */
    protected String name;
    /**
     * The ship's current {@link ModuleConfiguration}.
     */
    protected ModuleConfiguration moduleConfiguration;

    /**
     * Creates a ship with a default {@link ModuleConfiguration} specific to the concrete Ship type.
     *
     * @param name the name of the Ship
     */
    protected Ship(String name) {
        this.name = name;
        this.moduleConfiguration = getInitialModuleConfiguration();
    }
}

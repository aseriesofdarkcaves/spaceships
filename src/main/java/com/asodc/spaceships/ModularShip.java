package com.asodc.spaceships;

import com.asodc.spaceships.module.ModuleConfiguration;

/**
 * Allows a ship to include modules.
 */
public interface ModularShip {
    /**
     * Gets the initial default {@link ModuleConfiguration} of a {@link Ship}.
     *
     * @return the initial default {@link ModuleConfiguration}
     */
    ModuleConfiguration getInitialModuleConfiguration();
}

package com.asodc.spaceships;

import com.asodc.spaceships.module.ModuleConfiguration;

public interface ModularShip {
    /**
     * Gets the initial default {@link ModuleConfiguration} of a {@link Ship}.
     *
     * @return the initial default {@link ModuleConfiguration}
     */
    ModuleConfiguration getInitialModuleConfiguration();
}

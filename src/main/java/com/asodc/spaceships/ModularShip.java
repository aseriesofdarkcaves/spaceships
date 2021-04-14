package com.asodc.spaceships;

import com.asodc.spaceships.module.ModuleConfiguration;

public interface ModularShip {
    /**
     * Defines the initial {@link ModuleConfiguration} of a {@link Ship}.
     *
     * @return the initial {@link ModuleConfiguration}
     */
    ModuleConfiguration getInitialModuleConfiguration();
}

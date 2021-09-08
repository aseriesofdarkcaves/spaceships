package com.asodc.spaceships.module;

import java.util.ArrayList;
import java.util.List;

/**
 * The configuration of a ship's modules.
 */
public class ModuleConfiguration {
    /**
     * A {@link List} of the ship's current {@link Module}s.
     */
    private List<Module> modules;

    /**
     * Creates a {@link ModuleConfiguration} with no {@link Module}s.
     */
    public ModuleConfiguration() {
        modules = new ArrayList<>();
    }

    /**
     * Creates a {@link ModuleConfiguration} with a list of {@link Module}s.
     *
     * @param modules the list of modules to assign to this {@link ModuleConfiguration}
     */
    public ModuleConfiguration(List<Module> modules) {
        this.modules = modules;
    }

    /**
     * Adds a {@link Module} to this {@link ModuleConfiguration}.
     *
     * @param module the {@link Module} to add
     */
    public void add(Module module) {
        modules.add(module);
    }

    /**
     * Removes a {@link Module} from this {@link ModuleConfiguration}.
     *
     * @param module the {@link Module} to remove
     */
    public void remove(Module module) {
        modules.remove(module);
    }

    /**
     * Gets the {@link List} of current {@link Module}s.
     *
     * @return the current {@link List} of {@link Module}s
     */
    public List<Module> getModules() {
        return modules;
    }

    /**
     * Sets the {@link List} of current {@link Module}s.
     *
     * @param modules the {@link List} of {@link Module}s to set
     */
    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}

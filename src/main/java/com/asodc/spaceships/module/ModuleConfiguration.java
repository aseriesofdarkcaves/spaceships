package com.asodc.spaceships.module;

import java.util.List;

public class ModuleConfiguration {
    private List<Module> modules;

    public ModuleConfiguration() {
    }

    public ModuleConfiguration(List<Module> modules) {
        this.modules = modules;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}

package com.asodc.spaceships;

import com.asodc.spaceships.module.Module;

import java.util.ArrayList;
import java.util.List;

public abstract class Ship {
    private String name;
    private List<Module> modules;

    protected Ship(String name) {
        this.name = name;
        this.modules = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    protected void addModule(Module module) {
        modules.add(module);
    }

    protected void removeModule(Module module) {
        modules.remove(module);
    }

    protected void removeAllModules() {
        modules.clear();
    }
}

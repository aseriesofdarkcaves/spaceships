package com.asodc.spaceships.module;

public abstract class Module {
    /**
     * Tracks if a module is activated or deactivated.
     */
    private boolean isActive;

    /**
     * Create a module, activated by default.
     */
    protected Module() {
        isActive = true;
    }

    /**
     * Sets the active state of the module.
     *
     * @param isActive {@code true} to activate the module, {@code false} do deactivate it
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * Determines if the module is active or not.
     *
     * @return {@code true} if the module is active, {@code false} if deactivated
     */
    public boolean isActive() {
        return isActive;
    }
}

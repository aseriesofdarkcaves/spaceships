package com.asodc.spaceships.module;

import com.asodc.spaceships.cargo.Cargo;

import java.util.ArrayList;
import java.util.List;

public class CargoBay extends Module {
    private int capacity;
    private int currentSize;
    private List<Cargo> cargoList;

    public CargoBay(int capacity) {
        this.capacity = capacity;
        cargoList = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void add(Cargo item) throws IllegalArgumentException {
        if (item.getAmount() <= getRemainingSpace()) {
            currentSize += item.getAmount();
            cargoList.add(item);
        } else {
            String message = String.format("Can't add %d %s to cargo with an available space of %d!",
                    item.getAmount(), item.getItem().name(), getRemainingSpace());
            throw new IllegalArgumentException(message);
        }
    }

    public void remove(Cargo item) {
        // TODO: do we need to check if the item is present before attempting to remove it?
        currentSize -= item.getAmount();
        cargoList.remove(item);
    }

    public int getRemainingSpace() {
        return capacity - currentSize;
    }
}

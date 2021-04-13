package com.asodc.spaceships.module;

import com.asodc.spaceships.cargo.Cargo;

import java.util.ArrayList;
import java.util.List;

public class CargoBay implements Module {
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

    public void add(Cargo cargo) {
        cargoList.add(cargo);
    }

    public void remove(Cargo item) {
        cargoList.remove(item);
    }
}

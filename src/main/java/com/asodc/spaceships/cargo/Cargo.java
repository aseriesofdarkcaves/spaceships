package com.asodc.spaceships.cargo;

public class Cargo {
    private Item item;
    private int amount;

    public Cargo(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public enum Item {
        BEANS, CABBAGE, BISCUITS;
    }
}

package com.company;

public abstract class Furniture {

    protected int cost;
    protected String material;
    protected boolean isDelivery;

    public abstract int getSize();
    public abstract int getCostWithDelivery();

    public Furniture(int cost, String material, boolean isDelivery) {
        this.cost = cost;
        this.material = material;
        this.isDelivery = isDelivery;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isDelivery() {
        return isDelivery;
    }

    public void setDelivery(boolean delivery) {
        isDelivery = delivery;
    }
}
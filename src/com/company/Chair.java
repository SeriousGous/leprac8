package com.company;

public class Chair extends Furniture {
    private int widght;
    private int lenght;

    public Chair(int cost, String material, boolean isDelivery,int lenght, int widght) {
        super(cost, material, isDelivery);
        this.lenght = lenght;
        this.widght = widght;
    }

    @Override
    public int getSize() {
        return lenght*widght;
    }

    @Override
    public int getCostWithDelivery() {
        return cost + 500;
    }

    @Override
    public String toString() {
        return "Chair: " +
                "widght=" + widght +
                ", lenght=" + lenght +
                ", cost=" + cost +
                ", material='" + material + '\'' +
                ", isDelivery=" + isDelivery
                ;
    }
}
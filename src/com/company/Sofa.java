package com.company;

public class Sofa extends Furniture{
    private int widght;
    private int lenght;

    public Sofa(int cost, String material, boolean isDelivery,int widght, int lenght) {
        super(cost, material, isDelivery);
        this.widght = widght;
        this.lenght = lenght;
    }

    @Override
    public int getSize() {
        return widght*lenght;
    }

    @Override
    public int getCostWithDelivery() {
        if(isDelivery)return cost+1000;
        return cost;
    }

    @Override
    public String toString() {
        return "Sofa: " +
                "cost=" + cost +
                ", material='" + material + '\'' +
                ", isDelivery=" + isDelivery +
                ", widght=" + widght +
                ", lenght=" + lenght
                ;
    }
}
package com.company;

public class Table extends Furniture{
    private String tableFunction;
    private int widght;
    private int lenght;

    public Table(int cost, String material, boolean isDelivery,String tableFunction,int widght, int lenght){
        super(cost, material, isDelivery);
        this.tableFunction = tableFunction;
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
        return "Table: " +
                "cost =" + cost +
                ", isDelivery =" + isDelivery +
                ", tableFunction ='" + tableFunction + '\'' +
                ", widght =" + widght +
                ", lenght =" + lenght
                ;
    }
}
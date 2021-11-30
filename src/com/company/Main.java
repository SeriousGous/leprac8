package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(":%;!");
        FurnitureShop f = new FurnitureShop();

        f.addTables(new Table(1500, "Wood", true, "Lunch", 20, 30));
        f.addTables(new Table(2000, "Steel", true, "Office Work", 30, 40));
        f.addTables(new Table(1200, "Mix", true, "Lunch", 20, 30));

        f.addSofes(new Sofa(2000, "Mix", false,30,80));
        f.addSofes(new Sofa(2200, "Mix", true,40,90));
        f.addSofes(new Sofa(1400, "Mix", true,78,56));

        f.addChairs(new Chair(500,"Steel",true,20,10));
        f.addChairs(new Chair(300,"Mix",false,40,20));
        f.addChairs(new Chair(700,"Wood",true,12,45));

        f.start();
    }
}
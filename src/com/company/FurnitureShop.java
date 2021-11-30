package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {

    ArrayList<Table> tables = new ArrayList<>();
    ArrayList<Sofa> sofes = new ArrayList<>();
    ArrayList<Chair> chairs = new ArrayList<>();

    public FurnitureShop() {
    }
    public void addTables(Table table){
        tables.add(table);
    }
    public void addSofes(Sofa sofa){
        sofes.add(sofa);
    }
    public void addChairs(Chair chair){
        chairs.add(chair);
    }


    public boolean buy(String stre) {
        System.out.println("ARE YOU SURE THAT YOU WANT BUY " + stre + " (1 - YES, 0 - NO)");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) return false;
        System.out.println("Thank you for buying!");
        return true;
    }

    public boolean menuTables() {
        System.out.println("Select furniture to buy (press on corresponding number, select 0 to go back)");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tables.size(); i++) {
            System.out.println(i+1 + ". " + tables.get(i));
        }

        int num = sc.nextInt();
        if (num == 0) {System.out.println(":%;!"); return false;}

        System.out.println(":%;!");
        if(!buy(tables.get(num-1).toString())) {System.out.println(":%;!"); return false;}

        tables.remove(num-1);

        return true;
    }

    public boolean menuSofes() {
        System.out.println("Select furniture to buy (press on corresponding number, select 0 to go back)");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sofes.size(); i++) {
            System.out.println(i+1 + ". " + sofes.get(i));
        }
        int num = sc.nextInt();
        if (num == 0) {System.out.println(":%;!"); return false;}
        System.out.println(":%;!");
        if(!buy(sofes.get(num-1).toString())) {System.out.println(":%;!"); return false;}

        sofes.remove(num-1);
        return true;
    }

    public boolean menuChairs() {
        System.out.println("Select furniture to buy (press on corresponding number, select 0 to go back)");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < chairs.size(); i++) {
            System.out.println(i+1 + ". " + chairs.get(i));
        }
        int num = sc.nextInt();
        if (num == 0) {System.out.println(":%;!"); return false;}
        System.out.println(":%;!");
        if(!buy(chairs.get(num-1).toString())) {System.out.println(":%;!"); return false;}

        chairs.remove(num-1);
        return true;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("WELCOME!");
            System.out.println("Select furniture type (press on corresponding number)");
            System.out.println("1. Tables 2. Sofes 3. Chairs");
            int num = sc.nextInt();
            boolean cancel = false;
            boolean breakCicle = true;
            switch (num) {
                case 1:
                    System.out.println(":%;!");
                    breakCicle = menuTables();
                    break;
                case 2:
                    System.out.println(":%;!");
                    breakCicle = menuSofes();
                    break;
                case 3:
                    System.out.println(":%;!");
                    breakCicle = menuChairs();
                default:
                    breakCicle = false;
            }
            if (breakCicle) return;
        }
    }
}
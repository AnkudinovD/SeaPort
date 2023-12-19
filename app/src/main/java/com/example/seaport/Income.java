package com.example.seaport;

public abstract class Income {

    public static int id = 1;
    public String nameIncome;

    Income(int id, String nameIncome){
        this.id = id;
        this.nameIncome = nameIncome;
    }
    public abstract int monthIncome();
}

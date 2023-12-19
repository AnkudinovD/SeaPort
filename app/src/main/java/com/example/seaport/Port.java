package com.example.seaport;

public class Port extends Income{

    private int amountIncome;

    Port(String nameIncome, int amountIncome){
        super(id++, nameIncome);
        this.amountIncome = amountIncome;
    }

    @Override
    public int monthIncome(){
        return amountIncome;
    }
}

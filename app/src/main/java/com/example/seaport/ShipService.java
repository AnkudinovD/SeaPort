package com.example.seaport;

public class ShipService extends Income{

    private int shipNumber;
    private int priceRepair;

    ShipService(String nameShipService, int shipNumber, int priceRepair){
        super(id++, nameShipService);

        this.shipNumber = shipNumber;
        this.priceRepair = priceRepair;
    }

    @Override
    public int monthIncome() {
        return shipNumber * priceRepair;
    }
}

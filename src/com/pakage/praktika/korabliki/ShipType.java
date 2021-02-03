package com.pakage.praktika.korabliki;

public enum ShipType {
    BOAT(5), KATER(15), FREGAT(50), TANKER(100);


    private final int value;

    ShipType(int value){
        this.value = value;
    }

    public int getValue() {
        return  value;
    }

}

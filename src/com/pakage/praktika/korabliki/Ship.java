package com.pakage.praktika.korabliki;

public class Ship {
    private ShipType type;
    private ShipProduсt produсt;
    private int Shipcount;

    public Ship(ShipType type, ShipProduсt produсt) {
        this.type = type;
        this.produсt = produсt;
    }

    public ShipType getType() {
        return type;
    }

    public void setType(ShipType type) {
        this.type = type;
    }

    public ShipProduсt getProduсt() {
        return produсt;
    }

    public void setProduсt(ShipProduсt produсt) {
        this.produсt = produсt;
    }

    public int getShipcount() {
        return Shipcount;
    }
}

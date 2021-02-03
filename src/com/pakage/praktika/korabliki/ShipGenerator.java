package com.pakage.praktika.korabliki;

import java.util.Random;

public class ShipGenerator implements Runnable {
    private int count ;

    public ShipGenerator(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        int count = 0;

    }
    private ShipType getRandomType() {
        Random random = new Random();
        return ShipType.values()[random.nextInt(ShipType.values().length)];
    }
}

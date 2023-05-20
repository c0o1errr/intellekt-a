package com.intellekta.generics.middleearth;

import java.util.Random;

public abstract class AbstractUnit<T extends Unit> implements Unit {
    static Random rnd = new Random();
    int power;
    int powerMount;

    public AbstractUnit(String name, int minPower, int maxPower) {
        power = rnd.nextInt(minPower, maxPower);
    }

    public AbstractUnit(int min_power, int max_power) {
        powerMount = rnd.nextInt(min_power, max_power);
    }

    public <T extends AbstractUnit> void strike(T unit) {

    }



    public boolean isAlive(T unit) {
        if (T.power > 0) {
            return true;
        }
        return false;
    }
}

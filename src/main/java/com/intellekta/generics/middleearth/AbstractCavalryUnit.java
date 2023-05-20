package com.intellekta.generics.middleearth;

public abstract class AbstractCavalryUnit<T> extends AbstractUnit {
    public AbstractCavalryUnit(String name, int minPower, int maxPower) {
        super(name, minPower, maxPower);
    }

    T mount;

    public void setMount(T mount) {
        this.mount = mount;
    }

    class Horse extends AbstractUnit {
        int power;

        public Horse(int min_power, int max_power) {
            super(min_power, max_power);
        }

        public int getPower() {
            return power;
        }

        @Override
        public boolean isAlive() {
            return false;
        }
    }

    class Warg extends AbstractUnit {
        int power;

        public Warg(int min_power, int max_power) {
            super(min_power, max_power);
        }

        public int getPower() {
            return power;
        }

        @Override
        public boolean isAlive() {
            return false;
        }
    }

    int getPower() {
        return super.power + super.powerMount; // super.power+mount.getPower();
    }
}

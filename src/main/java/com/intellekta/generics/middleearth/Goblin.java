package com.intellekta.generics.middleearth;

class Goblin extends AbstractUnit implements MiddleEarthUnit {
    public Goblin(String name) {
        super(name, 2, 5);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

package com.intellekta.generics.middleearth;

class Troll extends AbstractUnit {
    public Troll(String name) {
        super(name, 11, 15);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

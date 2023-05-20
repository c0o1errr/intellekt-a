package com.intellekta.generics.middleearth;

class Human extends AbstractCavalryUnit {

    public Human(String name) {
        super(name, 7, 8);
        setMount(this.new Horse(4,5));
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

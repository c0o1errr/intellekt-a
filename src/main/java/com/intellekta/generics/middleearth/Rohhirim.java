package com.intellekta.generics.middleearth;

class Rohhirim<T extends Human & Beast> extends AbstractCavalryUnit {
    public Rohhirim(String name) {
        super(name, 7, 8);
        setMount(this.new Horse(4,5));
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

package com.intellekta.generics.middleearth;

class Wizard <T extends AbstractUnit & Beast> extends AbstractCavalryUnit {
    public Wizard(String name) {
        super(name, 20, 20);
        setMount(this.new Horse(4,5));
    }


    @Override
    public boolean isAlive() {
        return false;
    }
}

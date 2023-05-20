package com.intellekta.generics.middleearth;

class Orc <T extends AbstractUnit & Beast> extends AbstractCavalryUnit {
    public Orc(String name) {
        super(name, 8, 10);
        setMount(this.new Warg(4,7));
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

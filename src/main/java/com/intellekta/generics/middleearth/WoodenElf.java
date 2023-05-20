package com.intellekta.generics.middleearth;

class WoodenElf extends AbstractUnit {
    public WoodenElf(String name) {
        super(name, 6, 6);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

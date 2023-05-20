package com.intellekta.generics.middleearth;

class UrukHai<T extends Orc> extends AbstractUnit {
    public UrukHai(String name) {
        super(name, 10, 12);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

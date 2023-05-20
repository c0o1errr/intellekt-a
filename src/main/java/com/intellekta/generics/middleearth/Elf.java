package com.intellekta.generics.middleearth;

class Elf extends AbstractUnit {
    public Elf(String name) {
        super(name, 4, 7);
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

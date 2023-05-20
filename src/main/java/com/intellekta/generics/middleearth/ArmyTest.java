package com.intellekta.generics.middleearth;

import java.util.Random;

class ArmyTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        Army army = new Army();
        Army<MiddleEarthUnit> middleEarthUnitArmy = new Army<MiddleEarthUnit>();


        for (int i = 0; i < 6; i++) {
            army.getCavalry().add(i);
            army.getInfantry().add(5-i);
        }
        army.print();

        //System.out.println("\n" +army.release(7));
    }
}

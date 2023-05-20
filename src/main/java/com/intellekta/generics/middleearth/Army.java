package com.intellekta.generics.middleearth;

import java.util.ArrayList;
import java.util.Random;

public class Army<T extends Unit> {
    static Random rnd = new Random();
    ArrayList<T> Infantry = new ArrayList<T>();
    ArrayList<T> Cavalry = new ArrayList<T>();

    public ArrayList<T> getInfantry() {
        return Infantry;
    }

    public ArrayList<T> getCavalry() {
        return Cavalry;
    }

    public ArrayList<T> getArmy() {
        ArrayList<T> listAll = new ArrayList<T>(Cavalry.size() + Infantry.size());
        listAll.addAll(Cavalry);
        listAll.addAll(Infantry);
        return listAll;
    }

    public void print() {
        System.out.print(Cavalry.toString() + "\n" + Infantry.toString());
    }

    public boolean recruit(T unit) {                                // объект типизированного класса
        if (unit instanceof Infantry) {                             // для проверки unit на пехоту/ковалерию
            getInfantry().add(unit);
            return true;
        }
        if (unit instanceof Cavalry) {
            getCavalry().add(unit);
            return true;
        }
        return false;
    }

    public boolean release(T unit) {
        for (int i = 0; i < Infantry.size(); i++) {
            int index = Infantry.indexOf(unit);
            if (index == -1) {
                break;
            } else {
                Infantry.remove(index);
                return true;
            }
        }

        for (int i = 0; i < Cavalry.size(); i++) {
            int index = Cavalry.indexOf(unit);                      // indexOf возвращает -1 если не найден unit в списке Cavalry, инае создает int index
            if (index == -1) {
                break;
            } else {
                Cavalry.remove(index);
                return true;
            }
        }
        return false;
    }

    public T getRandomUnit() {
        return getArmy().get(rnd.nextInt(0, getArmy().size()));   // вернуть случайный unit из всего списка
    }

    public T getRandomUnit(T unit) {
        if (unit instanceof Infantry) {
            int rndInfantry = rnd.nextInt(getInfantry().size());
            return Infantry.get(rndInfantry);
        }
        if (unit instanceof Cavalry) {
            int rndCavalry = rnd.nextInt(getCavalry().size());
            return Cavalry.get(rndCavalry);
        }
        return null;
    }
}

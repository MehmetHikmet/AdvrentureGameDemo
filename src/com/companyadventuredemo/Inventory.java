package com.companyadventuredemo;

import com.companyadventuredemo.Items.Armor;
import com.companyadventuredemo.Items.Weapon;

public class Inventory {
   private Weapon weapon;
   private Armor armor;
    private boolean isFood;
    private boolean isFirewood;
    private boolean isWater;
    private boolean isSnakeDone;

    public boolean isSnakeDone() {
        return isSnakeDone;
    }

    public void setSnakeDone(boolean snakeDone) {
        isSnakeDone = snakeDone;
    }

    public boolean isFood() {
        return isFood;
    }

    public void setFood(boolean food) {
        isFood = food;
    }

    public boolean isFirewood() {
        return isFirewood;
    }

    public void setFirewood(boolean firewood) {
        isFirewood = firewood;
    }

    public boolean isWater() {
        return isWater;
    }

    public void setWater(boolean water) {
        isWater = water;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Inventory() {
        this.weapon = new Weapon("Punch",-1,0,0);
        this.armor =  new Armor(-1,"Empty",0,0);
        this.isFood=false;
        this.isFirewood=false;
        this.isWater=false;
        this.isSnakeDone=false;


    }

}

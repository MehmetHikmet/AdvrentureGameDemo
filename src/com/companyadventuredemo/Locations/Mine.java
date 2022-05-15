package com.companyadventuredemo.Locations;

import com.companyadventuredemo.Items.Armor;
import com.companyadventuredemo.Items.Weapon;
import com.companyadventuredemo.Obstacles.Snake;
import com.companyadventuredemo.Player;

public class Mine extends BattleLocation {
    public Mine(Player player) {
        super("Mine", player, new Snake(), 5);
    }

    @Override
    public void defeatObstacles(int obsNumber) {
        System.out.println("You killed" + obsNumber +" "+ this.getObstacle().getName());
        int randomItem = getRandom().nextInt(100);
        if (randomItem < 15) {// Win weapons
            randomItem = getRandom().nextInt(100);// Win weapon type
            winWeapon(randomItem);

        }else if (randomItem < 30){ // Win armors
            randomItem = getRandom().nextInt(100);// Win armor type
            winArmor(randomItem);

        }else if(randomItem < 55){// Win money
            randomItem = getRandom().nextInt(100);// Win money count
            winMoney(randomItem);

        }else{
            System.out.println("You got nothing");
        }

    }
    public void winWeapon(int randomNumber){
        if (randomNumber < 20) {
            System.out.print("Rifle(+" + Weapon.getWeaponObjById(3).getDamage()+" Damage). Want to change your gun? <Y>es <N>o :  ");
            if (input.nextLine().toUpperCase().equals("Y"))
                changePlayerWeapon(3);

        }else if (randomNumber < 50) {
            System.out.print("Sword(+" +Weapon.getWeaponObjById(2).getDamage()+" Damage). Want to change your gun? <Y>es <N>o :  ");
            if (input.nextLine().toUpperCase().equals("Y"))
                changePlayerWeapon(2);

        }else{
            System.out.print("Gun(+" +Weapon.getWeaponObjById(1).getDamage()+" Damage). Want to change your gun? <Y>es <N>o :  ");
            if (input.nextLine().toUpperCase().equals("Y"))
                changePlayerWeapon(1);

        }

    }
    public void changePlayerWeapon(int weaponID){
        this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(weaponID));
        System.out.println("Your new gun " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Your new damage:" + this.getPlayer().getTotalDamage());
    }
    public void winArmor(int randomNumber){
        if (randomNumber < 20) {
            System.out.print("Heavy (+" + Armor.getArmorObjById(3).getBlock() + " Blocking). Want to change your armor? <Y>es <N>o :  ");
            if(input.nextLine().toUpperCase().equals("E"))
                changePlayerArmor(3);
        }else if (randomNumber < 50) {
            System.out.print("Middle (+" + Armor.getArmorObjById(2).getBlock() + " Blocking). Want to change your armor? <Y>es <N>o :  ");
            if(input.nextLine().toUpperCase().equals("E"))
                changePlayerArmor(2);
        }else{
            System.out.print("Light(+" + Armor.getArmorObjById(1).getBlock() + " Blocking). Want to change your armor? <Y>es <N>o :  ");
            if(input.nextLine().toUpperCase().equals("E"))
                changePlayerArmor(1);
        }
    }
    public void changePlayerArmor(int armorID){
        this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(armorID));
        System.out.println("Your new armor  : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Your new blocking: " + this.getPlayer().getInventory().getArmor().getBlock());
    }
    public void winMoney(int randomNumber){
        if (randomNumber < 20) {
            addPlayerMoney(10);
        }else if (randomNumber <50) {
            addPlayerMoney(5);
        }else{
            addPlayerMoney(1);
        }
    }
    public void addPlayerMoney(int addedMoney){
        this.getPlayer().setMoney(this.getPlayer().getMoney() + addedMoney);
        System.out.println("You earned : " +addedMoney);
        System.out.println("Your money is  " + this.getPlayer().getMoney()+ "now");
    }


}

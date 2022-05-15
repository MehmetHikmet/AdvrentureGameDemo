package com.companyadventuredemo.Locations;

import com.companyadventuredemo.Player;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player,"Safe House");
    }
    @Override
    public boolean onLocation() {


        if (this.getPlayer().isWater()
                &&this.getPlayer().isFirewood()
                && this.getPlayer().isWater()
                && this.getPlayer().isSnakeDone()){
            System.out.println("\nCONGRATS !!! ALL JOBS ARE DONE !!! YOU COMPLETED THE GAME");
            System.exit(0);
        }else{
            System.out.println("You are in the Safe House");
            System.out.println("Your healthy is renewed");
            this.getPlayer().setHealth(this.getPlayer().getOrigHealth());
        }
        
        return true;
    }
}

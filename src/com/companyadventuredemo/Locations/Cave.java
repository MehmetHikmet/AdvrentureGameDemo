package com.companyadventuredemo.Locations;

import com.companyadventuredemo.Player;
import com.companyadventuredemo.Obstacles.Zombie;

public class Cave extends BattleLocation {
    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "food",3);
    }
}

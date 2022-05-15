package com.companyadventuredemo.Locations;

import com.companyadventuredemo.Obstacles.Bear;
import com.companyadventuredemo.Player;

public class River extends BattleLocation {
    public River(Player player) {
        super(player, "River", new Bear(), "water",2);
    }
}

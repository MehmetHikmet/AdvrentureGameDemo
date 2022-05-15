package com.companyadventuredemo.Locations;

import com.companyadventuredemo.Player;
import com.companyadventuredemo.Obstacles.Vampire;

public class Forest extends BattleLocation {
    public Forest(Player player) {
        super(player, "Forrest", new Vampire(), "firewood",3);
    }
}

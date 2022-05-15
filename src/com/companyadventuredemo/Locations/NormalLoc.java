package com.companyadventuredemo.Locations;

import com.companyadventuredemo.Player;

public abstract class NormalLoc extends Location {


    public NormalLoc(Player player, String name) {
        super(player, name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}

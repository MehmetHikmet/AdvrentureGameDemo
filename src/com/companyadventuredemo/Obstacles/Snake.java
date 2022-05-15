package com.companyadventuredemo.Obstacles;

import java.util.Random;

public class Snake extends Obstacle {
    private Random random=new Random();
    private int damage;
    public Snake() {
        super(4, "Snake", 12,new Random().nextInt(4)+3, 0);
    }

}

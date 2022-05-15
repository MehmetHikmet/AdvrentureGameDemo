package com.companyadventuredemo.Locations;

import com.companyadventuredemo.Obstacles.Obstacle;
import com.companyadventuredemo.Player;

import java.util.Random;

public abstract class  BattleLocation extends Location {

    Obstacle obstacle;
    private String award;
    private int maxObstacle;
    private static Random random;

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

    public BattleLocation(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
        random=new Random();
    }
    public BattleLocation(String name, Player player, Obstacle obstacle, int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.maxObstacle=maxObstacle;
        random=new Random();

    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int randomObstacleNumber(){
        Random r = new Random();
        return r.nextInt(this.maxObstacle)+1;
    }

    public static Random getRandom() {
        return random;
    }

    public static void setRandom(Random random) {
        BattleLocation.random = random;
    }

    @Override
    public boolean onLocation(){
        int obsNumber=randomObstacleNumber();
        System.out.println("You are at" + this.getName());
        System.out.println("Be careful because " +obsNumber+ " " + this.getObstacle().getName() + " lives here");
        System.out.println("<F>ight OR <R>un");
        String selectedAction=input.nextLine();
        selectedAction=selectedAction.toUpperCase();
        if(selectedAction.equals("F") && combat(obsNumber)){
                System.out.println("You killed all enemies in " + this.getName());
                return true;

        }
        if(this.getPlayer().getHealth()<=0){
            System.out.println("You DEAD !!!");

            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber){
        for(int i=0;i<obsNumber;i++){
            this.getObstacle().setHealth(this.getObstacle().getOrigHealth());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth()>0 && this.getObstacle().getHealth() > 0){
                System.out.println("<H>it OR <R>un");
                String selectedCombat=input.nextLine().toUpperCase();
                if(selectedCombat.equals("H")){
                    chooseHit();
                }else{
                    return false;
                }
            }
            if(this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                defeatObstacles(i);
            }
            else{
                return false;
            }
            completeLocation(i,obsNumber);
        }
        return true;

    }
    public void afterHit(){
        System.out.println("Your Health : " + this.getPlayer().getHealth());
        System.out.println("Your enemy's Health : " + this.getObstacle().getHealth());
    }
    public void playerStats(){
        System.out.println("Player Statistics");
        System.out.println("------------------");
        System.out.println("Health : " + this.getPlayer().getHealth());
        System.out.println("Your Gun : " +this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage : " + this.getPlayer().getTotalDamage());
        System.out.println("Money : " + this.getPlayer().getMoney());
        System.out.println("Your Armor : " +this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Your Blocking Power : " +this.getPlayer().getInventory().getArmor().getBlock());

    }
    public void obstacleStats(int i){
        System.out.println(i+1 + "." + this.getObstacle().getName() + "Statistics");
        System.out.println("Health : " + this.getObstacle().getHealth());
        System.out.println("Damage : " + this.getObstacle().getDamage());
        System.out.println("Award : " + this.getObstacle().getAward());
    }
    public void chooseHit(){
        int randomHit= random.nextInt(100);

        if (randomHit<50) {
            attack();
            defend();
        }else{
            if (this.getObstacle().getHealth()>0) {
                defend();
                attack();
            }
        }
    }
    public void attack(){
        System.out.println("You Hitted !!!");
        int obstacleHealth=this.getObstacle().getHealth()-this.getPlayer().getTotalDamage();
        this.getObstacle().setHealth(obstacleHealth);
        afterHit();
    }
    public void defend(){
        System.out.println(this.getObstacle().getName() + " Hitted !!");
        int obstacleTotalDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
        obstacleTotalDamage= Math.max(obstacleTotalDamage, 0);
        this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleTotalDamage);
        afterHit();
    }
    public void defeatObstacles(int obsNumber){
        System.out.println("You kileed : " + obsNumber + " " + this.getObstacle().getName());
        System.out.println("You earned : " + this.getObstacle().getAward());
        int balance=this.getPlayer().getMoney()+this.getObstacle().getAward();
        this.getPlayer().setMoney(balance);
        System.out.println("Your money is: "+this.getPlayer().getMoney()+ " now");
    }
    public void completeLocation(int i, int obsNumber){

        if (i+1 == obsNumber && this.getAward() != null) {
            System.out.println("\nCongratulations!! You Killed Them All !! You have some "+this.getAward().toUpperCase()+" now");
            if(this.getObstacle().getName().equals("Zombie")) this.getPlayer().getInventory().setFood(true);
            if(this.getObstacle().getName().equals("Vampire")) this.getPlayer().getInventory().setFirewood(true);
            if(this.getObstacle().getName().equals("Bear")) this.getPlayer().getInventory().setWater(true);
            if(this.getObstacle().getName().equals("Snake")) this.getPlayer().getInventory().setSnakeDone(true);
        }
    }

}

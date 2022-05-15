package com.companyadventuredemo;

import com.companyadventuredemo.Locations.*;

import java.util.Scanner;

public class Game {
    private Scanner input= new Scanner(System.in);

    public void start(){



        System.out.println("Please enter your name : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Welcome " + player.getPlayerName());
        System.out.println("********************************************");
        player.selectChar();
        System.out.println("********************************************");
        selectLocation(player);
    }

    public void selectLocation(Player player){

        while(true){
            Location location = null;
            player.printInfo();
            System.out.println("com/companyadventuredemo/Locations");
            System.out.println("*************************************");
            System.out.println("1 - Safe House");
            System.out.println("2 - ToolStore");
            System.out.println("3 - Cave");
            System.out.println("4 - Forrest");
            System.out.println("5 - River");
            System.out.println("6 - Mine");
            System.out.println("0 - Exit");
            System.out.println("*************************************");
            System.out.println("Please choose a location : ");
            int selectedLocation = input.nextInt();

            switch (selectedLocation){
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if(player.isFood()){
                        System.out.println("Your complete this stage");
                        selectLocation(player);
                        break;
                    }else{
                        location = new Cave(player);
                        break;
                    }

                case 4:
                    if(player.isFirewood()){
                        System.out.println("Your complete this stage");
                        selectLocation(player);
                        break;
                    }else{
                        location = new Forest(player);
                        break;
                    }
                case 5:
                    if(player.isWater()){
                        System.out.println("Your complete this stage");
                        selectLocation(player);
                        break;
                    }else{
                        location = new River(player);
                        break;
                    }
                case 6:
                    if(player.isSnakeDone()){
                        System.out.println("Your complete this stage");
                        selectLocation(player);
                        break;
                    }else{
                        location = new Mine(player);
                        break;
                    }
                case 0:
                    location=null;
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if(location==null){
                System.out.println("Game Over");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Game Over");
                break;
            }
        }

    }

}

package com.company;

public class Dungeon {

    public static void main(String[] args) {

        new Hero(); //creation of Hero

        int roundNumber = 1; //room number 1

        while (roundNumber <= 5) { //limit of rooms
            if (Hero.pvOfHero <= 0) { //finish condition
                System.exit(1);
            } else {
                newRandomRoom(); //barbarian or sorcerer
                roundNumber ++; //next room
            }
        }
        winTheChest(); //treasure
    }

    private static void winTheChest(){ //when you win
        System.out.println("Congratulation you have won the treasure and can now spend your gold as you wish\n" +
                "You have finished the game");
    }

    private static void newRandomRoom() {

        System.out.println("Let enter the donjon");
        int randomNumber = (int) (Math.round(Math.random())); //mathround = upper integer (entier supérieur de math random)
                                                             //mathrandom = decimal number

        if (randomNumber == 0) {

            new Room("Barbarian"); //Spawn Barbarian
            System.out.println("Behind the door there is a Barbarian");
            Hero.heroVsBarbarian();

        } else {

            new Room("Sorcerer");//Spawn Sorcerer
            System.out.println("Behind the door there is a Sorcerer");
            Hero.heroVsSorcerer();
        }
    }


}
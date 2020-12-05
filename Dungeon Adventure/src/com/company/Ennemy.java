package com.company;

public class Ennemy {

    public Ennemy(String ennemy) {

        if (ennemy.equals("barbarian")) {
            Barbarian ennemyOfHero= new Barbarian(); //Spawn of Barbarian

        } else {
            Sorcerer ennemyOfHero = new Sorcerer();//Spawn of Sorcerer
        }
    }
}
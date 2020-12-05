package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class Axe extends Weapons { // Axe extension of Weapons

    public static void axeAttack() {
        int randomNb = (int) (Math.round(Math.random() * 9)); // random decimal number time (X) 9

        if (randomNb <= 0) {
            Hero.pvOfHero -= 30; // Hero's Life Point -30 critical attack
            System.out.println("The Barbarian hit you with a critical hit\n" + //text
                    "you have lost 30 life points");
            System.out.println("You have only " + Hero.pvOfHero + " remaining"); //hero HP
        }
        else {
            System.out.println("The Barbarian is hitting you with his axe\n" + //text
                    "You have lost 15 life points");
            Hero.pvOfHero -= 15; //hero's life point -15 basical attack
            System.out.println("You have only " + Hero.pvOfHero + " remaining"); //hero HP
        }
    }
}


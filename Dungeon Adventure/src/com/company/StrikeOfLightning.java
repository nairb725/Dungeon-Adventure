package com.company;

public class StrikeOfLightning {

    public static void strikeOfLightningAttack() {

        int randomNb = (int)(Math.round(Math.random()*9)); //random critical

        if (randomNb == 0) {
            Hero.pvOfHero -= 10; //Hero'HP -10 and stun
            System.out.println("The Sorcerer throws you a stun for one turn\n" + "You have lost 10 life point");
            System.out.println("You have only " + Hero.pvOfHero + " remaining");//Hero's HP
            Hero.pvOfHero -= 10;//Hero'HP -10
            System.out.println("The Sorcerer is launching a strike of lightning at you\n" +
                    "You have lost 10 life points");//Hero's HP
        }
        else {
            System.out.println("The Sorcerer is launching a strike of lightning at you\n" +
                    "You have lost 10 life points");
            Hero.pvOfHero -= 10;//Hero'HP -10
            System.out.println("You have only " + Hero.pvOfHero + " remaining");//Hero's HP
        }
    }
}

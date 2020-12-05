package com.company;

public class Hero {
    static int pvOfHero; //Hero's HP value

    public Hero() {
        pvOfHero = 150;
    } //hero's HP

    public static void heroVsBarbarian() {

        Barbarian.pvOfBarbarian = 20; //Barbarian's HP

        while (true) {
            if (Barbarian.pvOfBarbarian <= 0) { //When Barbarian HP is under or equal 0
                System.out.println("Congrats, the Barbarian is dead, you can open next door");//When Barbarian are dead
                break;
            } else if (Hero.pvOfHero <= 0) {//When Hero HP is under or equal 0
                System.out.println("You are dead");//When Hero are dead
                break;
            }

            Axe.axeAttack();//barbarian's Weapon
            Sword.swordAttack();//Only using Sword against barbarian

        }
    }

    public static void heroVsSorcerer() {

        while (true) {
            if (Sorcerer.pvOfSorcerer <= 0) {//When sorcerer HP is under or equal 0
                System.out.println("Congrats, the Sorcerer is dead, you can open next door");//When sorcerer are dead
                break;
            } else if (Hero.pvOfHero <= 0) {//When Hero HP is under or equal 0
                System.out.println("You are dead");//When Hero are dead
                break;
            }

            StrikeOfLightning.strikeOfLightningAttack();//sorcerer's Weapon
            WaterFlask.WaterFlaskAttack(); //Only using WaterFlask against sorcerer


        }
    }
}


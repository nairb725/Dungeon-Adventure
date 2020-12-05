package com.company;

import java.util.Scanner;

public class WaterFlask extends Weapons {//WaterFlask extension of Weapons

    public static void WaterFlaskAttack() {
        System.out.println("Type WaterFlask to fight back");

        Scanner scan = new Scanner(System.in);//create a scanner
        String playerInput = scan.nextLine();//take player input

        if (playerInput.equals("WaterFlask")) {//if player tape WaterFlask
            Sorcerer.pvOfSorcerer -= 10;//barbarian's HP -10
            System.out.println("The Sorcerer has lost 10 life points");
            System.out.println("The Sorcerer has " + Sorcerer.pvOfSorcerer + " remaining");
        } else {
            System.out.println("You miss your attack");//miss attack if playerinput ≠ WaterFlask
        }
    }
}


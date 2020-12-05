package com.company;

import java.util.Scanner;

public class Sword extends Weapons { //Sword extension of Weapons


    public static void swordAttack() {

        System.out.println("Type Sword to fight back");
        int randomNb = (int) (Math.round(Math.random() * 9)); // random decimal number time (X) 9
        Scanner scan = new Scanner(System.in);//create a scanner
        String playerInput = scan.nextLine();//take player input
        if (playerInput.equals("Sword")) {//if player tape Sword

            if (randomNb == 0) {
                Barbarian.pvOfBarbarian  -= 10; //Barbarian'sHP -10 and stun
                System.out.println("You stun the Barbarian\n" + "He lost 10 life point");
                System.out.println("Barbarian only have " + Barbarian.pvOfBarbarian  + " remaining");//Barbarian's  HP
                Barbarian.pvOfBarbarian  -= 10;//Barbarian'sHP -10
                System.out.println("The Barbarian has lost 10 life point\n" +
                        "You deal 10 damage to the Barbarian");//Hero's HP
            }
            else {
                System.out.println("The Barbarian has lost 10 life point\n" +
                        "You deal 10 damage to the Barbarian");
                Barbarian.pvOfBarbarian -= 10;//Barbarian'sHP -10
                System.out.println("Barbarian only have " + Barbarian.pvOfBarbarian  + " remaining");//Hero's HP
            }
        } else {
            System.out.println("You miss your attack");//miss attack if playerinput ≠ Sword
        }

    }
}


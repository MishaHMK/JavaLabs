package com.myshalab.controller;

import com.myshalab.model.Factory;
import java.util.Scanner;

public class Launch{

    public void typeOfFight() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nChoose type of fight \n1. 1 vs 1\n2. Team vs Team");
        int num = in.nextInt();
        switch (num) {
            case 1:
            {
                teamCreation(1);
                break;
            }
            case 2:
            {
                System.out.println("Choose the teams size!\n");
                int count = in.nextInt();
                teamCreation(count);
                break;
            }
            default:
            {
                System.out.println("Error");
                System.exit(0);
            }
        }
    }

    public void teamCreation(int countOfDroid) {
        System.out.println("Select your droids\n");
        Factory team1 = new Factory(countOfDroid);
        System.out.println("\n Your team list:");
        team1.showInfo();
        System.out.println("\nChoose enemy droids!\n");
        Factory team2 = new Factory(countOfDroid);
        BattleArena battle = new BattleArena();
        battle.startFight(team1, team2);
    }

    public void startFight() {
        typeOfFight();
    }
}
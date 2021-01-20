package com.myshalab.controller;
import com.myshalab.model.Factory;
import com.myshalab.model.Droid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Random;

public class BattleArena {
    int myDroidTurn;
    int enemyDroidTurn;
    int myDroidIndex = 0;
    int turnNumber = 1;
    int enemyDroidIndex = 0;
    static BufferedReader reader;

    public void slash() {
        System.out.println("/////////////////////////////");
    }

    public void line() {
        System.out.println("..............................");
    }

    public void startFight(Factory myTeam, Factory enemyTeam) {
        while(true) {
            if (!myTeam.getArr().isEmpty() && !enemyTeam.getArr().isEmpty()) {
                this.turnInfo(myTeam);
                this.myTurn(myTeam, enemyTeam);
                if (!enemyTeam.getArr().isEmpty()) {
                    this.enemyTurn(myTeam, enemyTeam);
                    continue;
                }
            }

            if (enemyTeam.getArr().isEmpty()) {
                System.out.println("Congratulations, you won!");
            } else if (myTeam.getArr().isEmpty()) {
                System.out.println("The enemy team won, better luck next time.");
            }
            return;
        }
    }

    private void turnInfo(Factory myTeam) {
        this.line();
        System.out.println("Turn number " + this.turnNumber++);
        System.out.println("Team info:");
        this.slash();
        myTeam.showInfo();
        this.slash();
        System.out.println();
    }

    private void enemyTurn(Factory myTeam, Factory enemyTeam) {
        this.enemyTeamTurn(this.enemyDroidTurn, enemyTeam);
        Random random = new Random();
        int value = myTeam.getArr().size();
        if (value == 0) {
            this.myDroidIndex = 0;
        } else {
            this.myDroidIndex = random.nextInt(value);
        }
        System.out.println("Enemy droid attack " + myTeam.getArr().get(this.myDroidIndex).getName());
        shootEnemyDroid(enemyTeam, myTeam, this.enemyDroidTurn, this.myDroidIndex);
    }

    private void myTurn(Factory myTeam, Factory enemyTeam) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        this.myTeamTurn(this.myDroidTurn, myTeam);
        System.out.print("Enemies that can be attacked:\n");
        enemyTeam.showInfo();
        System.out.println(myTeam.getArr().get(this.myDroidTurn).getName() + " turn");
        System.out.print("Choose your enemy!\n");

        try {
            String enemyIndex = reader.readLine();
            this.enemyDroidIndex = Integer.parseInt(enemyIndex) - 1;
            this.slash();
            System.out.println("Your droid attack " + enemyTeam.getArr().get(this.enemyDroidIndex).getName());
            shootEnemyDroid(myTeam, enemyTeam, this.myDroidTurn, this.enemyDroidIndex);
        } catch (IndexOutOfBoundsException var5) {
            System.out.println("Please, choose existing enemy: 1-" + enemyTeam.getArr().size());
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    private void enemyTeamTurn(int turn, Factory Team) {
        if (turn < Team.getArr().size() - 1) {
            ++this.enemyDroidTurn;
        } else if (turn >= Team.getArr().size() - 1) {
            this.enemyDroidTurn = 0;
        }
    }

    private void myTeamTurn(int turn, Factory Team) {
        if (turn < Team.getArr().size() - 1) {
            ++this.myDroidTurn;
        } else if(turn >= Team.getArr().size() - 1) {
            this.myDroidTurn = 0;
        }

    }

    private void shootEnemyDroid(Factory attacker, Factory target, int droidAttackerIndex, int droidTargetIndex) {
        attacker.getArr().get(droidAttackerIndex).attack(target.getArr().get(droidTargetIndex));
        if (target.getArr().get(droidTargetIndex).Deceased()) {
            target.getArr().remove(droidTargetIndex);
        }

    }
}
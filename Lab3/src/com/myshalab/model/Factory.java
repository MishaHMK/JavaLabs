package com.myshalab.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Factory {
    private final List<Droid> Arr = new ArrayList();
    private final BufferedReader reader;

    public Factory(int count) {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.createTeam(count);
    }

    public List<Droid> getArr() {
        return this.Arr;
    }

    private void createTeam(int count) {
        for(int i = 0; i < count; ++i) {
            System.out.println("Select droid №" + (i + 1));

            try {
                this.Arr.add(this.chooseRole());
            } catch (IOException var) {
                var.printStackTrace();
            }
        }

    }

    private Droid chooseRole() throws IOException {
        System.out.println("\n Class: ");
        System.out.println("1. Damager\n2. Tank\n3. Survivor");
        Droid unit = null;

        String enter;
        for(enter = this.reader.readLine(); !enter.equals("1") && !enter.equals("2")  && !enter.equals("3"); enter = this.reader.readLine()) {
            System.out.println("Invalid request");
        }

        if (enter.equals("1")) {
            unit = new Damager();
        }

        if (enter.equals("2")) {
            unit = new Tank();
        }

        if (enter.equals("3")) {
            unit = new Survivor();
        }
        String name = this.nameGenerator();
        unit.setName(name);

        /*System.out.println(" \n Equipment: ");
        System.out.println("0.No equipment \n1.Paladin Sword\n2.Gladiator Shield\n3.Wizard Staff \n4.Glimmer Cape ");

        for(enter = this.reader.readLine(); !enter.equals("0") && !enter.equals("1") && !enter.equals("2") && !enter.equals("3") && !enter.equals("4"); enter = this.reader.readLine()) {
            System.out.println("Invalid request");
        }

        if (enter.equals("0")) {
            System.out.println("Nothing was equiped");
        }

        if (enter.equals("1")) {
            unit.damage += 15;
        }

        if (enter.equals("2")) {
            unit.health += 60;
        }
        if (enter.equals("3")) {
            unit.critchance += 5;
        }

        if (enter.equals("4")) {
            unit.dodgechance += 10;
        }*/

        return unit;
    }

    public String nameGenerator() {
        Random num = new Random();
        String[] names = new String[]{"R2D2", "C-3PO", "BB-8", "Bishop", "Marvin", "T-800", "OptimusPrime", "Megatron", "Bumblebee",
                "WALL-E", "T-1000", "03-6", "1-8JJ", "XX-O", "Q7-O0", "9-UO9", "72-5", "Starscream", "IronHide", "Arcee", "Fallen",
                "Soundwave", "L3-37", "Q5-1", "19-8", "46U-3", "5-FS", "5TC-H", "Y-A6", "2-4DZ", "CQ-Q"};
        return names[num.nextInt(30)];
    }

    public void showInfo() {
        for(int i = 1; i <= this.getArr().size(); ++i) {
            System.out.println(i + ". " + this.getArr().get(i - 1));
        }

    }


}

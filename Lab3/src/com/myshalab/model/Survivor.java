package com.myshalab.model;

import static java.lang.StrictMath.abs;

public class Survivor extends Droid {
    private int repair_charge;
    private int heal;

    public int getRepair_charge() {
        return repair_charge;
    }

    public void setRepair_charge(int repair_charge) {
        this.repair_charge = repair_charge;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public Survivor() {
        this.setHealth(100);
        this.setDamage(20);
        this.setCritchance(15);
        this.setDodgechance(40);
        this.setRepair_charge(5);
        this.setHeal(15);
    }

    public int getSelf_repair() {
        return repair_charge;
    }

    public String toString() {
        return "Name:" + this.getName()+ " (Type: Survivor HP: " + this.getHealth() + " Damage: " + this.getDamage() + " Repair: "
                + this.getRepair_charge() + " % Crt " + this.getCritchance() + "% Evs " + this.getDodgechance() + ")";
    }

    public int getHit(int damage) {
        if (this.toDodge()) {
            System.out.println("Dodge!!!");
            return 0;
        }
        return damage;
    }
}

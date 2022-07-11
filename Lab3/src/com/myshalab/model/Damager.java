package com.myshalab.model;

public class Damager extends Droid{
    private int energy;
    private int energy_cost;
    private int energy_regen;
    private int damage_bonus;

    public void setDamage_bonus(int damage_bonus) {
        this.damage_bonus = damage_bonus;
    }


    public void setEnergy_cost(int energy_cost) {
        this.energy_cost = energy_cost;
    }



    public void setEnergy_regen(int energy_regen) {
        this.energy_regen = energy_regen;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Damager() {
        this.setHealth(90);
        this.setDamage(30);
        this.setCritchance(35);
        this.setDodgechance(30);
        this.setEnergy(60);
        this.setEnergy_cost(20);
        this.setEnergy_regen(12);
        this.setDamage_bonus(20);
    }

    public String toString() {
        return "Name:" + this.getName() + " (Role: Damager HP: " + this.getHealth() + " Dmg: " + this.getDamage() + " Crt " +
                this.getCritchance() + "% Ddg " + this.getDodgechance() + " Energy "+ this.getEnergy()+" )";
    }
    public int strike(int attack){
        if(this.energy >= this.energy_cost) {
            this.energy -= this.energy_cost;
            attack += this.damage_bonus;
        };
        this.energy += this.energy_regen;
        return attack;
    }
}

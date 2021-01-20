package com.myshalab.model;
import java.util.Random;
import java.io.PrintStream;

public class Droid {
    protected String name;
    protected int health;
    protected int damage;
    protected int critchance;
    protected int dodgechance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCritchance() {
        return critchance;
    }

    public void setCritchance(int critchance) {
        this.critchance = critchance;
    }

    public int getDodgechance() {
        return dodgechance;
    }

    public void setDodgechance(int dodgechance) {
        this.dodgechance = dodgechance;
    }


    public int strike(int attack){
        if(this.RNG()<= this.getCritchance()){
            System.out.println("Crit!!!");
            attack*=2;
        }
        return attack;
    }

    public void attack(Droid droid) {
        int damage = this.toAttack();
        PrintStream log = System.out;
        int value = droid.getHit(damage);
        log.println("Damage done: " + value);
    }

    public int toAttack() {
        int attack = this.getDamage();
        attack = this.strike(attack);
        return attack;
    }

    public boolean toDodge() {
        return this.RNG() <= this.getDodgechance();
    }
    public boolean Deceased() {
        return this.getHealth() <= 0;
    }

    public int getHit(int damage) {
        if (this.toDodge()) {
            System.out.println("Dodge!!!");
            return 0;
        } else {
            this.health -= damage;
            return damage;
        }
    }

    public int RNG() {
        return (new Random()).nextInt(100);
    }

}

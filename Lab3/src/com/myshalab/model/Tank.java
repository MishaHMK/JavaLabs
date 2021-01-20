package com.myshalab.model;

public class Tank extends Droid {
    private int blocks;

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public Tank() {
        this.setHealth(150);
        this.setDamage(12);
        this.setCritchance(5);
        this.setDodgechance(20);
        this.setBlocks(3);
    }

    public String toString() {
        return "Name:" + this.getName()+ " (Type: Tank HP: " + this.getHealth() + " Damage: " + this.getDamage() + " Blocks: "
                + this.getBlocks() + " Crt " + this.getCritchance() + "% Evs " + this.getDodgechance() + "% )";
    }

    public boolean toBlock(int damage) {
        if (this.getBlocks() > 0) {
            --this.blocks;
            System.out.printf("%d hits to block by %s remained\n", this.blocks, this.name);
            return true;
        } else {
            return false;
        }
    }

    public int getHit(int damage) {
        if (this.toDodge()) {
            System.out.println("Dodge!!!");
            return 0;
        }
        else if(!this.toDodge() && !this.toBlock(this.damage)) {
            this.health -= damage;
            return damage;
        }
        else return 0;
    }

}

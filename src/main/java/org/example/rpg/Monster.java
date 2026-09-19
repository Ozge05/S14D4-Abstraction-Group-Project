package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;
    public Monster(int hitPoints, double damage, String name) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.name = name;

    }

    protected Monster() {
    }

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public abstract double attack();


}

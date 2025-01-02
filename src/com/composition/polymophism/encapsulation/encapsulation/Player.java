package com.composition.polymophism.encapsulation.encapsulation;

public class Player {
    private String name;
    private int healthPercentage;
    private String weapon;

    public Player(String name) {
        this(name, 100, "Sword");
    }

    public Player(String name, int healthPercentage, String weapon) {
        this.name = name;
        if (healthPercentage <= 0) {
            this.healthPercentage = 1;
        } else if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0){
            System.out.println("Player knocked out of the game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth){
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100){
            System.out.println("player restored to 100%");
            healthPercentage = 100;
        }
    }
}

package com.example.game;

public class DamageBoost extends CharacterDecorator {
    private final int extraDamage;

    public DamageBoost(Character wrappee, int extraDamage) {
        super(wrappee);
        this.extraDamage = extraDamage;
    }

    @Override
    public void attack() {
        System.out.println("Attacking with boosted damage " + getDamage() + " using sprite " + getSprite());
    }

    @Override
    public int getDamage() {
        return super.getDamage() + extraDamage;
    }
}

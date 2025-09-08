package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int extraSpeed;

    public SpeedBoost(Character wrappee, int extraSpeed) {
        super(wrappee);
        this.extraSpeed = extraSpeed;
    }

    @Override
    public void move() {
        System.out.println("Moving at boosted speed " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + extraSpeed;
    }
}

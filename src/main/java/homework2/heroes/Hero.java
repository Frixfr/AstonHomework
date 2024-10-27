package homework2.heroes;

import homework2.Consts;
import homework2.Mortal;

public abstract class Hero implements Mortal {
    protected final String name;
    protected int health;
    protected int damage;

    public Hero(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void attack(Mortal mortal) {
        mortal.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        health = health >= damage ? health - damage : Consts.MINIMAL_HEALTH;
    }

    @Override
    public boolean isAlive() {
        return health != Consts.MINIMAL_HEALTH;
    }
}

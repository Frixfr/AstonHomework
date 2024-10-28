package homework2.enemies;

import homework2.Consts;
import homework2.Mortal;

public abstract class Enemy implements Mortal {
    protected int maxHealth;
    protected int health;
    protected int damage;

    public Enemy(int health, int damage) {
        this.health = health;
        this.maxHealth = health;
        this.damage = damage;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void attack(Mortal mortal) {
        if (isAlive()) {
            mortal.takeDamage(damage);
        }
    }

    @Override
    public void takeDamage(int damage) {
        if (isAlive()) {
            health = health >= damage ? health - damage : Consts.MINIMAL_HEALTH;
        }
    }

    @Override
    public boolean isAlive() {
        return health != Consts.MINIMAL_HEALTH;
    }
}

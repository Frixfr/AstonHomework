package homework2.enemies;

import homework2.Consts;

public class Zombie extends Enemy {
    private static final int REVIVE_PERCENT = 10;

    public Zombie(int health) {
        super(health);
        this.damage = 7;
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        passiveAbility();
    }

    private void passiveAbility() {
        if (this.health == Consts.MINIMAL_HEALTH && (Math.random()*100) < REVIVE_PERCENT) {
            System.out.println("Зомби возвродился");
            this.health = this.maxHealth;
        }
    }
}

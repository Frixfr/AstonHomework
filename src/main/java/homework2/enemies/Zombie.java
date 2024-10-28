package homework2.enemies;

import homework2.Consts;

public class Zombie extends Enemy {
    private static final int REVIVE_CHANCE = 10;
    private static final int BASE_DAMAGE = 2;

    public Zombie(int health) {
        super(health, BASE_DAMAGE);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        reviveAbility();
    }

    private void reviveAbility() {
        if (this.health == Consts.MINIMAL_HEALTH && (Math.random()*100) < REVIVE_CHANCE) {
            System.out.println("Зомби возвродился");
            this.health = this.maxHealth;
        }
    }
}

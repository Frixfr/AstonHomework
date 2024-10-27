package homework2.heroes;

import homework2.Mortal;

public class Mage extends Hero {
    private static final int MAX_HEALTH = 16;
    private static final int BASE_DAMAGE = 10;
    private static final int FROZEN_PROJECTILE_CHANCE = 20;
    private static final int FROZEN_PROJECTILE_DAMAGE = 8;

    public Mage(String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE);
    }

    @Override
    public void attack(Mortal mortal) {
        super.attack(mortal);
        frozenProjectileAbility(mortal);
    }

    private void frozenProjectileAbility(Mortal mortal) {
        if ((Math.random() * 100) < FROZEN_PROJECTILE_CHANCE) {
            System.out.println("Маг выпустил ледяной снаряд");
            mortal.takeDamage(FROZEN_PROJECTILE_DAMAGE);
        }
    }
}

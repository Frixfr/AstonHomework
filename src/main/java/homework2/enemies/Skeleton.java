package homework2.enemies;

import homework2.Mortal;

public class Skeleton extends Enemy {
    private static final int INCREASED_DAMAGE_CHANCE = 15;
    private static final int ADDITIONAL_DAMAGE = 4;
    private static final int BASE_DAMAGE = 10;

    public Skeleton(int health) {
        super(health, BASE_DAMAGE);
    }

    @Override
    public void attack(Mortal mortal) {
        super.attack(mortal);
        additionalDamageAbility(mortal);
    }

    private void additionalDamageAbility(Mortal mortal) {
        if ((Math.random() * 100) < INCREASED_DAMAGE_CHANCE) {
            System.out.println("Скелет нанёс увеличенный урон");
            mortal.takeDamage(ADDITIONAL_DAMAGE);
        }
    }
}

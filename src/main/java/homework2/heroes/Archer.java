package homework2.heroes;

import homework2.Mortal;

public class Archer extends Hero {
    private static final int MAX_HEALTH = 18;
    private static final int BASE_DAMAGE = 8;
    private static final int DOUBLE_DAMAGE_CHANCE = 20;

    public Archer(String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE);
    }

    @Override
    public void attack(Mortal mortal) {
        super.attack(mortal);
        additionalDamageAbility(mortal);
    }

    private void additionalDamageAbility(Mortal mortal) {
        if ((Math.random() * 100) < DOUBLE_DAMAGE_CHANCE) {
            System.out.println("Лучник нанёс двойной урон");
            mortal.takeDamage(this.damage);
        }
    }
}

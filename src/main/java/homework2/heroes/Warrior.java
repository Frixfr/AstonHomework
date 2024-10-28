package homework2.heroes;

public class Warrior extends Hero {
    private static final int MAX_HEALTH = 25;
    private static final int BASE_DAMAGE = 7;
    private static final int BLOCK_DAMAGE_CHANCE = 30;

    public Warrior(String name) {
        super(name, MAX_HEALTH, BASE_DAMAGE);
    }

    @Override
    public void takeDamage(int damage) {
        frozenProjectileAbility(damage);
    }

    private void frozenProjectileAbility(int damage) {
        if ((Math.random() * 100) < BLOCK_DAMAGE_CHANCE) {
            System.out.println("Воин заблокировал урон");
        } else {
            super.takeDamage(damage);
        }
    }
}

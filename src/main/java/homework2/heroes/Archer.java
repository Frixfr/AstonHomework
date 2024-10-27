package homework2.heroes;

public class Archer extends Hero {
    private static final int maxHealth = 18;
    private static final int baseDamage = 8;

    public Archer(String name) {
        super(name, maxHealth, baseDamage);
    }
}

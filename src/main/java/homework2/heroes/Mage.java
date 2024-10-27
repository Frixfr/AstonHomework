package homework2.heroes;

public class Mage extends Hero {
    private static final int maxHealth = 16;
    private static final int baseDamage = 10;

    public Mage(String name) {
        super(name, maxHealth, baseDamage);
    }
}

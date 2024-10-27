package homework2.heroes;

public class Warrior extends Hero {
    private static final int maxHealth = 16;
    private static final int baseDamage = 10;

    public Warrior(String name) {
        super(name, maxHealth, baseDamage);
    }
}

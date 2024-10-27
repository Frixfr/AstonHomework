package homework2.enemies;

import homework2.Mortal;

public class Dragon extends Enemy {
    private static final int BASE_DAMAGE = 16;
    private static final int FIRE_BALL_CHANCE = 5;
    private static final int FIRE_BALL_DAMAGE = 10;

    public Dragon(int health) {
        super(health, BASE_DAMAGE);
    }

    @Override
    public void attack(Mortal mortal) {
        super.attack(mortal);
        fireBallAbility(mortal);
    }

    private void fireBallAbility(Mortal mortal) {
        if ((Math.random() * 100) < FIRE_BALL_CHANCE) {
            System.out.println("Дракон выпустил огненный шар");
            mortal.takeDamage(FIRE_BALL_DAMAGE);
        }
    }
}

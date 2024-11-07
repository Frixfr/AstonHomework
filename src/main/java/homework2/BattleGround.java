package homework2;

import homework2.enemies.Zombie;
import homework2.heroes.Archer;

public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Funtick");
        Zombie zombie = new Zombie(100);
        while (zombie.isAlive() && archer.isAlive()) {
            System.out.println("Archer health: " + archer.getHealth() + "\nZombie health: " + zombie.getHealth());
            archer.attack(zombie);
            zombie.attack(archer);
        }
        System.out.println(winner(archer, zombie).getClass() + " победил!");
    }

    private static Mortal winner(Mortal mortal, Mortal mortal2) {
        return mortal.isAlive() ? mortal : mortal2;
    }
}

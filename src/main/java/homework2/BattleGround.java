package homework2;

import homework2.enemies.Zombie;
import homework2.heroes.Archer;

public class BattleGround {
    public static void main(String[] args) {
        Archer archer = new Archer("Funtick");
        Zombie zombie = new Zombie(20);
        archer.attack(zombie);
        System.out.println(zombie.getHealth());
        zombie.attack(archer);
        System.out.println(archer.getHealth());
        System.out.println(Math.random()*100);


    }
}

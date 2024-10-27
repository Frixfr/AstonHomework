package homework2;

public interface Mortal {
    boolean isAlive();
    void takeDamage(int damage);
    void attack(Mortal mortal);
}

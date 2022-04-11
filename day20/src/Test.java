public class Test {
    public static void main(String[] args) {
        Weapon w1 = new Tank();
        Weapon w2 = new Flighter();
        Weapon w3 = new WarShip();
        w1.attack();
        w2.move();
        w3.attack();



    }
}

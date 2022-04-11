public class Flighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("飞机用机枪攻击");
    }

    @Override
    public void move() {
        System.out.println("飞机是飞行的");
    }
}

public class WarShip extends Weapon{
    @Override
    public void attack() {
        System.out.println("战车使用大炮攻击");
    }

    @Override
    public void move() {
        System.out.println("战车使用轮子移动");
    }
}

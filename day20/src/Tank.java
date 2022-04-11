import java.sql.SQLOutput;

public class Tank extends Weapon {
    @Override
    public void attack() {
        System.out.println("坦克用炮攻击");

    }

    @Override
    public void move() {
        System.out.println("坦克用履带移动");
    }
}

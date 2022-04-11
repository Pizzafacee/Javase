public  abstract class AbstratcTest01 {
    public AbstratcTest01() {
    }
    public abstract void doOther();

    public static void main(String[] args) {
        //AbstratcTest01 at = new AbstratcTest01();抽象类无法被实例化
    }


}
 class   Student02  extends AbstratcTest01{
    public  void doSome(){};

     @Override
     public void doOther() {

     }
 }
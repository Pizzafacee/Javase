public interface InterfaceTest01 {
     void doSome();

}


interface InterfaceTest03{


}
class Student03 implements  InterfaceTest01 ,InterfaceTest02,InterfaceTest03{
    public static void main(String[] args) {
        InterfaceTest01 it = new Student03();
        it.doSome();
    }
    @Override
    public void doSome() {

    }
}

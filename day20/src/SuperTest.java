public class SuperTest {
     SuperTest(){

    }
   SuperTest(String name) {
        this.name = name;
    }

    String name ;
    void value(){
        name = "China";
    }

}
class City extends SuperTest{
    String name;
    void value(){
        name="shanghai";
        super.value();
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        City city = new City();
         city.value();
    }
}
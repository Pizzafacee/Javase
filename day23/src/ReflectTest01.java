public class ReflectTest01 {
    public static void main(String[] args) throws Exception{
        //第一种获取字节码的方法
        Class c1 = Class.forName("java.util.Date");
        Object obj = c1.newInstance();
        System.out.println(obj);
        Class c2 = Class.forName("java.lang.String");
        Object obj2 = c2.newInstance();
        System.out.println(obj2);
        Class c5 = Class.forName("ReflectTest01");
        Object obj5 = c5 .newInstance();
        /*Class c4 = Class.forName("java.lang.Double");
        Object obj4 = c4.newInstance();
        Class c3 = Class.forName("java.lang.Integer");
        Object obj3 = c3.newInstance();*/

        //第二种方式
        String s = "as";
        Class x = s.getClass();
        System.out.println(c2 == x);
        /*Integer a  = 10;
        Class b = a.getClass();
        System.out.println(b == c3 );*/




        //第三种方式
        Class z = String.class;
        Class f = Double.class;

        Class  ac = Account.class;







    }
}

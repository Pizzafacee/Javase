public class AccountThreadTest {
   public static void main(String[] args) {
      Account act = new Account("wangkang",10000);
      AccountThread at1 =new AccountThread(act);
      AccountThread at2 = new AccountThread(act);
      at1.setName("t1");
      at2.setName("t2");
      at1.start();
      at2.start();
   }



}

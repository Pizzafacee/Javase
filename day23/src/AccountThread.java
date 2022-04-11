public class AccountThread extends Thread{
     private Account act;

    public AccountThread(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        double money = 5000;
        act.withdraw(money);
    }
}

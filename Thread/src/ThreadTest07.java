public class ThreadTest07 {
    //关于线程的安全性
    //三个条件 会有数据安全问题
    //多线程并发
    //有共享数据
    //共享数据有修改行为
    //需要使用 线程同步机制解决线程安全问题
    //但这个机制会损失一定的效率
    //对银行账户进行操作，表示两个线程共享同一个账户
    public static void main(String[] args) {
        Account act = new Account("123456",10000);//先创建一个账户对象
        Thread t1 = new AccountThread(act);//两个线程共享同一个账户
        Thread t2 = new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();//执行run方法，操作堆里面的同一个对象
    }

}



class Account{
    private String accountNum;
    private double balance;

    public Account(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double money){//取款的方法
        double before = this.getBalance();
        double after = before - money;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
        System.out.println(Thread.currentThread().getName() + "取款成功，账户余额为" + this.getBalance());
    }
}

class AccountThread extends Thread{
     private Account act;

    public AccountThread() {
    }

    public AccountThread(Account act) {
        this.act = act;
    }

    public Account getAct() {
        return act;
    }

    public void setAct(Account act) {
        this.act = act;
    }

    @Override
    public void run() {//run方法的执行表示共享同一个账户
        this.act.withdraw(5000);
    }
}

public class ThreadTest08 {


    //关于线程的安全性
    //三个条件 会有数据安全问题
    //多线程并发
    //有共享数据
    //共享数据有修改行为
    //需要使用 线程同步机制解决线程安全问题
    //但这个机制会损失一定的效率
    //对银行账户进行操作，表示两个线程共享同一个账户

    //这里需要解决线程安全问题
    //关于同步代码块synchronize（）{}，同步范围越大，效率越低，
    //三种变量中只有成员变量和静态变量是有线程安全问题，局部变量没有线程安全问题。
    //synchronized 可以用在实例方法上 如 public synchronized void withdraw(){}  修饰一个实例方法时
    //共享的对象一定是this,别无选择；
    //总结：
    /*synchronized有三种写法
    * 第一种：同步代码块
    *           synchronized（）{
    *           同步代码块}
    * 第二种：修饰实例方法，共享对象一定是this
    * 第三种：修饰在静态方法上 */
    public static void main(String[] args) {
        Account2 act = new Account2("123456", 10000);//先创建一个账户对象
        Thread t1 = new Account2Thread(act);//两个线程共享同一个账户
        Thread t2 = new Account2Thread(act);
        Thread t3 = new Account2Thread(act);
        t3.setName("t3");
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();//执行run方法，操作堆里面的同一个对象
        t3.start();
    }

}


class Account2 {

    private String accountNum;
    private double balance;

    public Account2(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public Account2() {
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

    public void withdraw(double money) {//取款的方法

        //以下这几行代码不能并发，需要同步执行，使用synchronized关键字
        synchronized (this) {//小括号里的东西非常重要
            //假设有很多个线程，只希望其中几个线程并发，其他几个不需要，就需要选定一个不用并发的共享的对象
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
}

class Account2Thread extends Thread {
    private Account2 act;

    public Account2Thread() {
    }

    public Account2Thread(Account2 act) {
        this.act = act;
    }

    public Account2 getAct() {
        return act;
    }

    public void setAct(Account2 act) {
        this.act = act;
    }

    @Override
    public void run() {//run方法的执行表示共享同一个账户
        this.act.withdraw(5000);
    }
}

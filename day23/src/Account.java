public class Account {
    private String actName;
    private double balance;

    public Account() {
    }

    public Account(String actName, double balance) {
        this.actName = actName;
        this.balance = balance;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double money) {
        synchronized (this) {
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
            System.out.println(Thread.currentThread().getName() + "取钱" + money + "," + "余额为" + this.getBalance());
        }
    }
}

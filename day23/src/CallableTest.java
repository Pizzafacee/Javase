import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("task线程开始");
                Thread.sleep(5000);
                System.out.println("task线程结束");
                int a = 100;
                int b = 333;
                return a + b;

            }
        });
        Thread t = new Thread(futureTask);
        t.start();

        try {
            Object obj = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}

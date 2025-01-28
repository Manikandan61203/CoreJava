package MultiThreadTask;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyRunnable implements Runnable{
    private final int t;

    public MyRunnable(int t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println("Task "+t+" : Thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class MultiThreadTask {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        ExecutorService es= Executors.newFixedThreadPool(5);
        System.out.println("Enter the Number of Tasks :");
        int n=o.nextInt();
        for (int i=1;i<=n;i++)
        {
            MyRunnable mr=new MyRunnable(i);
            es.execute(mr);
        }
        es.shutdown();
    }
}

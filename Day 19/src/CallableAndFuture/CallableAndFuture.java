package CallableAndFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

class FactorialTask implements Callable<Long>{
    private final int num;

    public FactorialTask(int num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
public class CallableAndFuture {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        ExecutorService es= Executors.newFixedThreadPool(5);
        System.out.println("Enter No of Numbers :");
        int n=o.nextInt();
        List<Integer> l=new ArrayList<>();
        System.out.println("Enter "+n+" Numbers :");
        for(int i=0;i<n;i++)
        {
            l.add(o.nextInt());
        }
        List<Future<Long>> fl=new ArrayList<>();
        for(int i:l)
        {
            Callable<Long> c=new FactorialTask(i);
            Future<Long> fv = es.submit(c);
            fl.add(fv);
        }
        es.shutdown();
        System.out.println("Factorial Results :");
        for(Future<Long> f:fl)
        {
            try {
                System.out.println(f.get());
                }
            catch (InterruptedException |ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        o.close();
    }
}
package ForkAndJoin_Pool;

import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Long>{
    private static final int THRESHOLD = 10000;
    private Long s,e;

    public SumTask(long s, long e) {
        this.s = s;
        this.e = e;
    }

    @Override
    protected Long compute() {
        if(e-s<=THRESHOLD)
        {
            long sum=0;
            for(long i=s;i<e;i++){
                    sum+=i;
            }
            return sum;
        }
        long m=(s+e)/2;
        SumTask lt=new SumTask(s,m);
        SumTask rt=new SumTask(m,e);
        lt.fork();
        rt.fork();
        long ltres=lt.join();
        long rtres=rt.join();
        return ltres+rtres;
    }
}
public class ForkAndJoin_Pool {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter the Numbers to Sum :");
        long n=o.nextLong();
        ForkJoinPool p=new ForkJoinPool();
        SumTask s=new SumTask(0,n);
        long result=p.invoke(s);
        System.out.println("Sum of "+n+" is "+result);
    }
}

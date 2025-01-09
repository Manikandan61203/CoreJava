package ConcurrentHashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class OnlineVotingSystem {
    private static final ConcurrentHashMap<String,Integer> vote=new ConcurrentHashMap<>();
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Names to Vote Seperated with space( ):");
        String s[]=o.nextLine().split(" ");
        ExecutorService exe= Executors.newFixedThreadPool(s.length);
        for(int i=0;i<s.length;i++)
        {
            exe.submit(new Voting(s[i]));
        }
        exe.shutdown();
        try {
            if(!exe.awaitTermination(60, TimeUnit.SECONDS)){
            exe.shutdownNow();}
        }
        catch (InterruptedException e){
            exe.shutdownNow();
            Thread.currentThread().interrupt();
        }
        display();
    }
    public static void castvote(String can)
    {
        Integer cur=vote.get(can);
        if(cur==null){
            cur=0;}
        vote.put(can,cur+1);
    }
    public static void display()
    {
        System.out.println("Final Vote Count:");
        for(String can: vote.keySet())
        {
            System.out.println(can+": "+vote.get(can));
        }
    }
    private static class Voting implements Runnable
    {
        private final String  can;
        public Voting(String can){
            this.can=can;
        }
        @Override
        public void run() {
            castvote(can);
        }
    }
}

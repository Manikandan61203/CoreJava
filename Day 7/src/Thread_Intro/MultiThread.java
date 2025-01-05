package Thread_Intro;
class Number implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=1;i<=10;i++)
            {
                System.out.println("Number:"+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e)
        {
            System.out.println("Number Thread is Interrupted");
        }
    }
}
class Squarenum implements Runnable{
    @Override
    public void run() {
        try {
            for (int i=1;i<=10;i++)
            {
                System.out.println("Square of "+i+" is "+i*i);
                Thread.sleep(700);
            }
        }catch (InterruptedException e)
        {
            System.out.println("SquareNumber Thread is Interrupted");
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        Thread num=new Thread(new Number());
        Thread square=new Thread(new Squarenum());
        num.start();
        square.start();
        try {
            num.join();
            square.join();
        }catch (InterruptedException e)
        {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Both Threads are Executed Successfully");
    }

}

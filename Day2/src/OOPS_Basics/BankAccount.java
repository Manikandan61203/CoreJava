package OOPS_Basics;
public class BankAccount {
    private String acc_no;
    private double bal;
    public BankAccount(String acc_no,int bal)
    {
        this.acc_no=acc_no;
        this.bal=bal;
    }
    public void Deposit(double amount)
    {
        if(amount>0)
        {
            bal+=amount;
            System.out.println("Deposited Amount:"+amount);
        }
        else
            System.out.println("Invalid Deposit Amount");
    }
    public void WithDraw(double amount)
    {
        if(amount>0&&amount<bal)
        {
            bal-=amount;
            System.out.println("WithDrawn Amount:"+amount);
        }
        else if(amount>bal)
            System.out.println("Insufficient Balance");
        else
            System.out.println("Invalid Withdrawal Amount");
    }
    public double Check()
    {
        return bal;
    }
    public static void main(String args[])
    {
        BankAccount o=new BankAccount("123456789",1000);
        System.out.println("Initial Balance"+o.Check());
        o.Deposit(500);
        System.out.println("Balance After Deposit:"+o.Check());
        o.WithDraw(250);
        System.out.println("Balance After Withdraw:"+o.Check());
        o.Deposit(2500);
        System.out.println("Balance After Deposit:"+o.Check());
        o.WithDraw(3000);
        System.out.println("Balance After Withdraw:"+o.Check());
    }
}

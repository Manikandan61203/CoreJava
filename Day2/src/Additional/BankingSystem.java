package Additional;
import java.util.Scanner;
class BankAccount {
    private String acc_Holder;
    private int acc_no;
    private double bal;
    public BankAccount(String acc_Holder,int acc_no) {
        this.acc_Holder=acc_Holder;
        this.acc_no=acc_no;
        this.bal=0.0;
    }
    public void deposit(double amount) {
        if(amount>0)
        {
            bal+=amount;
            System.out.println("Successfully deposited:"+amount);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount>0 && amount<=bal)
        {
            bal-=amount;
            System.out.println("Successfully withdrew:"+amount);
        }
        else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
    public void checkBalance() {
        System.out.println("Account Balance:"+bal);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        BankAccount account=null;
        System.out.println("Banking Operations are");
        System.out.println("1.Open Account");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Check Balance");
        System.out.println("5.Exit");
        System.out.print("Enter the operation number: ");
        boolean exit=false;
        while(!exit){
        int op=o.nextInt();
        switch (op) {
            case 1:
                o.nextLine();
                System.out.println("Enter Account Holder's Name:");
                String name = o.nextLine();
                System.out.println("Enter account number:");
                int acc_no = o.nextInt();
                account = new BankAccount(name, acc_no);
                System.out.println("Account Successfully Opened.");
                break;
            case 2:
                if (account == null) {
                    System.out.println("No account found.Please open an account first.");
                } else {
                    System.out.print("Enter Amount to Deposit: ");
                    double amount = o.nextDouble();
                    account.deposit(amount);
                }
                break;
            case 3:
                if (account == null) {
                    System.out.println("No account found.Please open an account first.");
                } else {
                    System.out.print("Enter amount to withdraw:");
                    double amount = o.nextDouble();
                    account.withdraw(amount);
                }
                break;
            case 4:
                if (account == null) {
                    System.out.println("No account found.Please open an account first.");
                } else {
                    account.checkBalance();
                }
                break;
            case 5:
                System.out.println("Exiting the banking system.Goodbye!");
                exit=true;
                break;
            default:
                System.out.println("Invalid operation number. Exiting.");
            }
        }
    }
}



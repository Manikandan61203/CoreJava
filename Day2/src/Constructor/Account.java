package Constructor;
public class Account {
    private String acc_no;
    private double bal;
    public Account(){
        this.acc_no="Unknown";
        this.bal=0.0;
    }
    public Account(String acc_no){
        this.acc_no=acc_no;
        this.bal=0.0;
    }
    public Account(String acc_no,double bal) {
        this.acc_no=acc_no;
        this.bal=bal;
    }
    public void display(){
        System.out.println("Account Details:");
        System.out.println("Account Number:"+this.acc_no);
        System.out.println("Balance:"+this.bal);
    }
    public static void main(String[] args) {
        Account acc1=new Account();
        Account acc2=new Account("4988431548");
        Account acc3=new Account("9111499565",50000);
        System.out.println("Account 1:");
        acc1.display();
        System.out.println("Account 2:");
        acc2.display();
        System.out.println("Account 3:");
        acc3.display();
    }
}


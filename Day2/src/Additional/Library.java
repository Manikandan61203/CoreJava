package Additional;
import java.util.Scanner;
class Member {
    double id;
    String name;
    public Member(double id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public void MemberDetails()
    {
        System.out.println("Member Details");
        System.out.println("Id:"+id);
        System.out.println("Name:"+ name);
    }
}

class Book {
    public void Showbook()
    {
        System.out.println("Books Available Categories are");
        System.out.println("Astrology");
        System.out.println("Journals");
        System.out.println("Novels");
        System.out.println("Poetry");
        System.out.println("Comics");
    }
}
class Librarian {
    String bkname;
    double id;
    public Librarian(String bkname,double id)
    {
        this.bkname=bkname;
        this.id=id;
    }
    public void ShowDetails(){
        System.out.println("Book Borrowed Details");
        System.out.println("Id:"+id);
        System.out.println("BookName:"+bkname);
    }

}
public class Library {
    public static void main(String args[])
    {
        Scanner o=new Scanner(System.in);
        System.out.println("Give Member id:");
        double id=o.nextDouble();
        o.nextLine();
        System.out.println("Give Member Name:");
        String name=o.nextLine();
        Member mem=new Member(id,name);
        mem.MemberDetails();
        Book book=new Book();
        book.Showbook();
        System.out.println("Enter Book Name:");
        String bkname=o.nextLine();
        Librarian lib=new Librarian(bkname,id);
        lib.ShowDetails();
    }
}

package Constructor;
public class Book{
    private String title;
    private String author;
    public Book(){
        this.title="Unknown Title";
        this.author="Unknown Author";
    }
    public void display(){
        System.out.println("Book Details:");
        System.out.println("Title:"+this.title);
        System.out.println("Author:"+this.author);
    }
    public static void main(String args[]) {
        Book o=new Book();
        o.display();
    }
}

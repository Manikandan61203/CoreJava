package Interface;
interface Printer {
    void print();
}
interface Scanner {
    void scan();
}
public class AllInOne implements Printer,Scanner {
    @Override
    public void print() {
        System.out.println("Printing Document");
    }
    @Override
    public void scan() {
        System.out.println("Scanning Document");
    }
    public static void main(String args[]) {
        AllInOne o = new AllInOne();
        o.print();
        o.scan();
    }
}


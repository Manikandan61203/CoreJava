package Arrays;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        int n1 = o.nextInt();
        int n2 = o.nextInt();
        int a[][] = new int[n1][n2];
        int b[][] = new int[n1][n2];
        int res[][]=new int[n1][n2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                a[i][j] = o.nextInt();
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                b[i][j] = o.nextInt();
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                res[i][j]=a[i][j]+b[i][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class StudentManagementSystem {
    static Scanner o=new Scanner(System.in);
    static AccessData ad=new AccessData();
    public static void main(String[] args) {
        Boolean b=true;
        while (b){
            System.out.println("---- Student Management System ----");
            System.out.println("1. Add a New Student               |");
            System.out.println("2. View All Students               |");
            System.out.println("3. Search Student                  |");
            System.out.println("4. Update Student Details          |");
            System.out.println("5. Delete Student Record           |");
            System.out.println("6. Filter Students by Grade        |");
            System.out.println("7. Sort Students by Name or Age    |");
            System.out.println("8. Exit                            |");
            int op= ad.getValidInt("Enter Operation :");
            switch (op){
                case 1-> ad.CreateStudent();
                case 2-> ad.AllStudents();
                case 3-> ad.SearchStudent();
                case 4-> ad.UpdateStudent();
                case 5-> ad.DeleteStudent();
                case 6-> ad.filterStudentByGrade();
                case 7-> ad.sortStudent();
                case 8-> {
                    b=false;
                    System.out.println("Exiting Student Management System. Goodbye!");
                    o.close();
                }
                default-> System.out.println("Invalid Option! Please choose a number between 1-8.");
            }
        }
    }
}
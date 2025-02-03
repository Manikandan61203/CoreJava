import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AccessData {

    static Scanner o=new Scanner(System.in);
    TreeMap<Integer,Student> s=new TreeMap<>();
    static File file=new File("StudentData.JSON");
    static ObjectMapper om=new ObjectMapper();
    private final Deque<TreeMap<Integer,Student>> undo = new ArrayDeque<>();

    public AccessData() {
        retriveJson();
    }

    private TreeMap<Integer, Student> deepCopy(TreeMap<Integer, Student> og) {
        TreeMap<Integer, Student> copy = new TreeMap<>();
        for (Map.Entry<Integer, Student> entry : og.entrySet()) {
            Student orstd = entry.getValue();
            Student studentCopy = new Student(
                    orstd.getId(),
                    orstd.getName(),
                    orstd.getAge(),
                    orstd.getGrade(),
                    orstd.getEmail()
            );
            copy.put(entry.getKey(), studentCopy);
        }
        return copy;
    }

    public void UndoOperation(){
        if(!undo.isEmpty()){
            s=undo.pop();
            System.out.println("Undo Successful! Reverted to the previous state.");
            SaveJson();
        } else {
            System.out.println("No previous operations to undo.");
        }
    }

    public void SaveJson(){
        new Thread(()-> {
            try {
                om.writerWithDefaultPrettyPrinter().writeValue(file, s);
                System.out.println("Data Saved Successfully.");
            } catch (IOException e) {
                System.err.println("Error Saving Data: " + e.getMessage());
            }
        }).start();
    }

    public void retriveJson(){
        if(!file.exists()||file.length()==0){
            System.out.println("No Student Data Available...");
            return;
        }
        new Thread(()->{
            try {
                s=om.readValue(file, new TypeReference<TreeMap<Integer, Student>>() {});
            } catch (IOException e) {
                System.err.println("Error Saving Data: "+e.getMessage());
            }
        }).start();
    }

    public static boolean emailValid(String email) {
        String re="^[a-zA-Z0-9]([a-zA-Z0-9.-_])*@[a-zA-Z0-9.-_]+\\.(com|org|net)$";
        Pattern p=Pattern.compile(re);
        Matcher m=p.matcher(email);
        return m.matches();
    }

    public boolean getUserConfirmation(String message) {
        while (true) {
            String confirm = getValidString(message + " (Y/N)").toUpperCase();
            if (confirm.equals("Y")) return true;
            if (confirm.equals("N")) return false;
            System.out.println("Invalid input! Please enter 'Y' or 'N'.");
        }
    }

    public int getValidInt(String msg) {
        int num;
        while(true)
        {
            try {
                System.out.println(msg);
                num=o.nextInt();
                o.nextLine();
                return num;
            }catch (InputMismatchException e){
                System.out.println("Invalid Input!");
                o.nextLine();
            }
        }
    }

    public String getValidString(String msg) {
        String string;
        while(true){
            System.out.println(msg);
            string=o.nextLine().trim();
            if(!string.isEmpty())
                return string;
            System.out.println("Input Can't Be Empty! Try Again.");
        }
    }

    public void CreateStudent(){
        if(!getUserConfirmation("Are You Sure! You Want to Create New Student?")) return;
        System.out.println("---- Enter Student Details ----");
        int id = getValidInt("Enter Student Id :");
        if (s.containsKey(id)) {
            System.out.println("Error: Student ID already exists.");
            return;
        }
        String name = getValidString("Enter the Name :").toUpperCase();
        int age = getValidInt("Enter the Age :");
        String grade = getValidString("Enter the Grade :").toUpperCase();
        String email;
        while(true){
            email = getValidString("Enter the Email :");
            if (emailValid(email))
                break;
            System.out.println("Invalid Email! Please Enter a Valid Email :");
        }
        undo.push(deepCopy(s));
        s.put(id, new Student(id, name, age, grade, email));
        System.out.println("New Student Added Successfully");
        SaveJson();
    }

    public void AllStudents(){
        if(s.isEmpty()){
            System.out.println("No Students Available.");
            return;
        }
        System.out.println("----- Student Details -----");
        s.values().stream().sorted(Comparator.comparingInt(Student::getId)).forEach(System.out::println);
    }

    public void SearchStudent() {
        while (true) {
            System.out.println("\n---- Search Options ----");
            System.out.println("1. ID                     |");
            System.out.println("2. Name                   |");
            System.out.println("3. Email                  |");
            System.out.println("4. Exit                   |");
            int sop = getValidInt("Enter your Choice :");
            switch (sop) {
                case 1 -> SearchById();
                case 2 -> SearchByName();
                case 3 -> SearchByEmail();
                case 4 -> {
                    System.out.println("Exiting From Search");
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public void SearchById(){
        while (true) {
            int sid = getValidInt("Enter Student ID :");
            System.out.println("Search Result :");
            Optional<Student> sbop = Optional.ofNullable(s.get(sid));
            if (sbop.isPresent()) {
                System.out.println(sbop.get());
                break;
            } else {
                System.out.println("Student Id is Invalid! No student found with ID: " + sid);
            }
        }
    }

    public void SearchByName(){
        while (true) {
            String Sname = getValidString("Enter Student Name :").toUpperCase();
            System.out.println("Search Result :");
            List<Student> res = s.values().stream()
                    .filter(student -> student.getName().equalsIgnoreCase(Sname))
                    .collect(Collectors.toList());
            if (!res.isEmpty()) {
                res.forEach(System.out::println);
                break;
            } else System.out.println("Student Name is Invalid!");
        }
    }

    public void SearchByEmail(){
        while (true) {
            String Semail = getValidString("Enter Student Email :");
            System.out.println("Search Result :");
            List<Student> res = s.values().stream()
                    .filter(student -> student.getEmail().equalsIgnoreCase(Semail))
                    .collect(Collectors.toList());
            if (!res.isEmpty()) {
                res.forEach(System.out::println);
                break;
            } else System.out.println("Student Email is Invalid!");
        }
    }

    public void UpdateStudent(){
        if(!getUserConfirmation("Are You Sure! You Want to Update Student?")) return;
        int uid;
        while(true)
        {
            uid=getValidInt("Enter Student Id :");
            if(s.containsKey(uid))
                break;
            else {
                System.out.println("Enter Valid Student id :");
                uid=o.nextInt();
            }
        }
        undo.push(deepCopy(s));
        while(true)
        {
            System.out.println("\n---- Update Options ----");
            System.out.println("1. Name                   |");
            System.out.println("2. Age                    |");
            System.out.println("3. Grade                  |");
            System.out.println("4. Email                  |");
            System.out.println("5. Exit                   |");
            int uop=getValidInt("Enter the Option :");
            switch (uop)
            {
                case 1->{s.get(uid).setName(getValidString("Enter the Name to Update :").toUpperCase());
                    System.out.println("Student Name Updated Successfully");
                }
                case 2->{s.get(uid).setAge(getValidInt("Enter the Age to Update :"));
                    System.out.println("Student Age Updated Successfully");
                }
                case 3->{s.get(uid).setGrade(getValidString("Enter the Grade to Update :").toUpperCase());
                    System.out.println("Student Grade Updated Successfully");
                }
                case 4-> {
                    String uemail;
                    while (true) {
                        uemail = getValidString("Enter the Email to Update :");
                        if (emailValid(uemail)) {
                            s.get(uid).setEmail(uemail);
                            break;
                        } else {
                            System.out.println("Invalid Email! Please Try Again.");
                        }
                    }
                }
                case 5->{
                    SaveJson();
                    return;
                }
                default-> System.out.println("Invalid! Enter a Valid Option :");
            }
            System.out.println("Student Updated Successfully.");
            SaveJson();
        }
    }

    public void DeleteStudent(){
        if(!getUserConfirmation("Are You Sure! You Want to Delete Student Record?")) return;
        int did=getValidInt("Enter Student Id To Delete :");
        if(s.containsKey(did)) {
            undo.push(deepCopy(s));
            s.remove(did);
            System.out.println("Student Removed Successfully");
            SaveJson();
        }else {
            System.out.println("Error: Student ID not found.");
        }
    }

    public void filterStudentByGrade(){
        String fgrade=getValidString("Enter Grade to Filter :");
        List<Student> fs=s.values().stream()
                .filter(student -> student.getGrade().equalsIgnoreCase(fgrade))
                        .collect(Collectors.toList());
        if(fs.isEmpty()){
            System.out.println("No Student Found With Grade :"+fgrade);
        }
        int n1[]={1};
        fs.forEach(student -> System.out.println("Student "+(n1[0]++)+student));
    }

    public void sortStudent(){
        while (true) {
            System.out.println("\n---- Filter Options ----");
            System.out.println("1. Sort by Name           |");
            System.out.println("2. Sort by Age            |");
            System.out.println("3. Exit                   |");
            int choice = getValidInt("Enter your choice:");
            switch (choice) {
                case 1-> s.values().stream()
                        .sorted(Comparator.comparing(Student::getName))
                        .forEach(System.out::println);
                case 2-> s.values().stream()
                        .sorted(Comparator.comparingInt(Student::getAge))
                        .forEach(System.out::println);
                case 3-> {return;}
                default-> System.out.println("Invalid choice! Showing unsorted results.");
            }
        }
    }
}

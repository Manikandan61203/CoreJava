import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class AccessData {

    static Scanner o=new Scanner(System.in);
    HashMap<Integer,Student> s=new HashMap<>();
    static File file=new File("StudentData.JSON");
    static ObjectMapper om=new ObjectMapper();

    public AccessData() {
        retriveJson();
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
                s=om.readValue(file, new TypeReference<HashMap<Integer, Student>>() {});
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
        System.out.println("---- Enter Student Details ----");
        int id = getValidInt("Enter Student Id :");
        if (s.containsKey(id)) {
            System.out.println("Error: Student ID already exists.");
            return;
        }
        String name = getValidString("Enter the Name :");
        int age = getValidInt("Enter the Age :");
        String grade = getValidString("Enter the Grade :");
        String email;
        while(true){
            email = getValidString("Enter the Email :");
            if (emailValid(email))
                break;
            System.out.println("Invalid Email! Please Enter a Valid Email :");
        }
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
    public void SearchStudent(){
        int sid;
        boolean b=true;
        while (b) {
            sid = getValidInt("Enter Student Id :");
            System.out.println("Search Result:");
            Optional<Student> sopt = Optional.ofNullable(s.get(sid));
            if(sopt.isPresent()){
                System.out.print("Student Details :");
                System.out.println(sopt.get());
                break;
            }else{
                System.out.println("Student Id is Invalid! No student found with ID: " + sid);
            }
        }
    }
    public void UpdateStudent(){
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
                case 1->{s.get(uid).setName(getValidString("Enter the Name to Update :"));
                    System.out.println("Student Name Updated Successfully");
                }
                case 2->{s.get(uid).setAge(getValidInt("Enter the Age to Update :"));
                    System.out.println("Student Age Updated Successfully");
                }
                case 3->{s.get(uid).setGrade(getValidString("Enter the Grade to Update :"));
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
        int did=getValidInt("Enter Student Id To Delete :");
        if(s.containsKey(did)) {
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

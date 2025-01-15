package Creating_File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFileWriteName {
    public static void main(String[] args) {
        String fileName="name.txt";
        String name="Manikandan";
        try (BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Java  Backend\\Day 12\\src\\Creating_File\\"+fileName))){
            bw.write(name);
            System.out.println("Name Written in a Created File");
        } catch (IOException e) {
            System.out.println("Some Error Occured:");
            e.printStackTrace();
        }
    }
}

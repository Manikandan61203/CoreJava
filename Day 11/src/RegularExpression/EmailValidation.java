package RegularExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Emails to Validate seperated by (,):");
        String s[]=o.nextLine().split(",");
        List<String> l=new ArrayList<>(Arrays.asList(s));
        String re="^[a-zA-Z0-9]([a-zA-Z0-9.-_])+\\.(com|org|net)$";
        Pattern p=Pattern.compile(re);
        for(String i:l) {
            Matcher m = p.matcher(i);
            if(m.matches())
            {
                System.out.println(i+": Valid");
            }
            else {
                System.out.println(i+": Invalid");
            }
        }
    }
}

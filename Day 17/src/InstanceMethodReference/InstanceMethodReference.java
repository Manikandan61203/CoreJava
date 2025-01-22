package InstanceMethodReference;

import java.util.Scanner;
import java.util.function.BiFunction;

public class InstanceMethodReference {
    public InstanceMethodReference() {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Two Strings Seperated by Space to Compare :");
        String s[]=o.nextLine().split(" ");
        BiFunction<String,String,Integer> bf=String::compareToIgnoreCase;
        if(bf.apply(s[0],s[1])==0){
            System.out.println("Two Strings are Same.");
        }else {
            System.out.println("Two Strings are Different.");
        }
    }

    public static void main(String[] args) {
        InstanceMethodReference imr=new InstanceMethodReference();
    }
}

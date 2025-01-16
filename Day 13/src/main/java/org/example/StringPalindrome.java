package org.example;
public class StringPalindrome {
    public Boolean Palindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1=sb.toString();
        return s.equals(s1);
    }
}

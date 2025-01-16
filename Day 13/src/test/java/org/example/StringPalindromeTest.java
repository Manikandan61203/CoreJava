package org.example;
import org.junit.Assert;
import org.junit.Test;
public class StringPalindromeTest {
    @Test
    public void checkValidPalindrome()
    {
        StringPalindrome sp=new StringPalindrome();
        boolean r=sp.Palindrome("malayalam");
        Assert.assertEquals(true,r);
    }
    @Test
    public void checkInValidPalindrome()
    {
        StringPalindrome sp=new StringPalindrome();
        boolean r=sp.Palindrome("palindrome");
        Assert.assertEquals(false,r);
    }
    @Test
    public void checkCaseSensitive()
    {
        StringPalindrome sp=new StringPalindrome();
        boolean r=sp.Palindrome("RaceCar");
        Assert.assertEquals(false,r);
    }
    @Test
    public void checkEmptyString()
    {
        StringPalindrome sp=new StringPalindrome();
        boolean r=sp.Palindrome("");
        Assert.assertEquals(true,r);
    }
}
package org.example;
import org.junit.Assert;
import org.junit.Test;
public class ReverseStringTest {
    @Test
    public void checkNullString() {
        ReverseString rs = new ReverseString();
        String r = rs.reverseString("");
        Assert.assertEquals("", r);
    }
    @Test
    public void checkSingleString() {
        ReverseString rs = new ReverseString();
        String r = rs.reverseString("a");
        Assert.assertEquals("a", r);
    }
    @Test
    public void checkSpecialString() {
        ReverseString rs = new ReverseString();
        String r = rs.reverseString("@");
        Assert.assertEquals("@", r);
    }
    @Test
    public void checkNumberString() {
        ReverseString rs = new ReverseString();
        String r = rs.reverseString("01234");
        Assert.assertEquals("43210", r);
    }
    @Test
    public void checkPalindromeString() {
        ReverseString rs = new ReverseString();
        String r = rs.reverseString("malayalam");
        Assert.assertEquals("malayalam", r);
    }
}
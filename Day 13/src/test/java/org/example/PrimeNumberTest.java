package org.example;
import org.junit.Assert;
import org.junit.Test;
public class PrimeNumberTest {
    @Test
    public void Zero(){
        PrimeNumber pm=new PrimeNumber();
        boolean r=pm.CheckPrime(0);
        Assert.assertEquals(false,r);
    }
    @Test
    public void One(){
        PrimeNumber pm=new PrimeNumber();
        boolean r=pm.CheckPrime(1);
        Assert.assertEquals(false,r);
    }
    @Test
    public void NegativeNumber(){
        PrimeNumber pm=new PrimeNumber();
        boolean r=pm.CheckPrime(-1);
        Assert.assertEquals(false,r);
    }
    @Test
    public void LargePrimeNumber(){
        PrimeNumber pm=new PrimeNumber();
        boolean r=pm.CheckPrime(3000000);
        Assert.assertEquals(false,r);
    }
}
package org.example;
import org.junit.Assert;
import org.junit.Test;
public class FactorialCalcTest {
    @Test
    public void Zero()
    {
        FactorialCalc fc=new FactorialCalc();
        long r=fc.Calc(0);
        Assert.assertEquals(1,r);
    }
    @Test
    public void smallPositiveNumber()
    {
        FactorialCalc fc=new FactorialCalc();
        long r=fc.Calc(5);
        Assert.assertEquals(120,r);
    }
    @Test(expected = IllegalArgumentException.class)
    public void NegativeNumber()
    {
        FactorialCalc fc=new FactorialCalc();
        long r=fc.Calc(-5);
        Assert.assertEquals("Negative Numbers are Not Allowed",r);
    }
}

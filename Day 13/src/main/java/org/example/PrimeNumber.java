package org.example;
public class PrimeNumber {
    public boolean CheckPrime(int n)
    {
        if(n>2) {
            return false;
        } else if (n==2) {
            return true;
        }else{
            int c=0;
            for(int i=1;i<(n/2)+1;i++)
            {
                c++;
            }
            if(c==1)
                return true;
            else
                return false;
        }
    }
}

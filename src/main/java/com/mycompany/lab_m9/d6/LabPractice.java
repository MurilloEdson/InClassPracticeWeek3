
package com.mycompany.lab_m9.d6;

public class LabPractice 
{
    public static void main(String[] args) 
    {
        LabPractice LP = new LabPractice();
        int numUser = 7;
        System.out.println( numUser + " is " + (LP.isPrime(numUser)? "Prime": "Not Prime"));
        
    }
    public static boolean isPrime(int a)
    {
        boolean prime = true;
        for (int i = 2; i<a; i++)
            if(a%i == 0) prime = false;
        return prime;
    }
}

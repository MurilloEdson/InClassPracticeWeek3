
package com.mycompany.lab_m9.d6;

public class LabPractice 
{
    public static void main(String[] args) 
    {
        LabPractice LP = new LabPractice();
        int [] arr={3,7,11};
        System.out.println("The sum of the numbers is " + LP.getPrimeSum(arr));
        
    }
    public static int getPrimeSum(int[] nums)
    {
       int sum = 0;
       for (int i = 0; i < nums.length; i++)
       sum = sum + nums[i];
       return sum;
    }
}

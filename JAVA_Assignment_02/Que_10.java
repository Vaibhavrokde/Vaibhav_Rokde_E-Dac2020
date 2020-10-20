/* 10.)  Write the program to find the sum of even elements and
sum of odd elements present in the array of integer type.*/

package com.company;

public class Que_10 {

    public static void main(String[] args)
    {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int evenSum = 0,oddSum=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                evenSum = evenSum+array[i];
            }
            else
            {
                oddSum = oddSum+array[i];
            }

        }
        System.out.println("Sum of even array elements is:"+evenSum);
        System.out.println("Sum of odd array elements is:"+oddSum);
    }
}

/* 6.	Program to show sum and average of 10 element array. Accept array elements from user. */
package com.company;

import java.util.Scanner;

public class Que_06 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int arr[]=new int[10];

        System.out.println("Enter values in array of limit 10");
        for(int i=0;i<(arr.length);i++)
        {
            arr[i]=input.nextInt();
        }

        float sum=0;

        for(int num:arr)
        {
            sum=sum+num;
        }
        System.out.println("Sum of array is: "+ sum);

        System.out.println("Avarage of array is: "+ sum/arr.length);



    }
}

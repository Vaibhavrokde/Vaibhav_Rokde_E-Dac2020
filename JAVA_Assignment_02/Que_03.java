/* 3.	Program to check whether number is prime or not.*/

package com.company;

import java.util.Scanner;

public class Que_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num=input.nextInt();
        int c=0;


        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                c++;
            }

        }

        if(c>=1)
        {
            System.out.println("Number is not prime");

        }else
        {
            System.out.println("Number is prime");
        }

    }

}

/* 2.	Write a program to reverse a given number.*/

package com.company;

import java.util.Scanner;

public class Que_02 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter number");
        int num= input.nextInt();
        int reverse=0;
        while(num!=0)
        {
            int digit=num%10;
            reverse=(reverse*10)+ digit;
            num=num/10;
        }
        System.out.println("reverse number is : "+reverse);


    }
}

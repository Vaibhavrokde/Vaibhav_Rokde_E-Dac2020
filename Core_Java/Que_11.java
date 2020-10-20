/* 11.	Write a program to swap two numbers without using third variable.*/

package com.company;

import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");

        int A=input.nextInt();
        System.out.println("Enter 2st number");

        int B=input.nextInt();
        int C;
        System.out.println("Before Swapping");
        System.out.println("1st number is: "+ A+" 2nd Number is: "+B);
        System.out.println();

        C=A;
        A=B;
        B=C;
        System.out.println("After Swapping");
        System.out.println("1st number is: "+ A +" 2nd Number is: "+B);



    }


}

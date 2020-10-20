/* 13.	Program to find greatest in 3 numbers.
[ once using if else statement and then using ternary operator ( logical operator) ]  */

package com.company;

import java.util.Scanner;

public class Que_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A=input.nextInt();
        int B=input.nextInt();
        int C=input.nextInt();

        if(A>B && A>C)
        {
            System.out.println("Greatest Number is: "+ A);

        }
        System.out.println(B>C ? "Greatest number is: "+B:"Greatest number is: "+C);

    }
}

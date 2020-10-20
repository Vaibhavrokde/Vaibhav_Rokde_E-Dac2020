/* 08.	Write a program to find the simple interest.
Take the principle amount, rate of interest and time from user using Scanner class.*/

package com.company;
import java.util.Scanner;

public class Que_8 {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter principle amount");
        double P= input.nextDouble();
        System.out.println("Enter rate of interest");
        float R = input.nextFloat();
        float r = R/100;

        System.out.println("Enter year in month");
        float yr = input.nextFloat();
        float t=yr/12;

        Double Interest= P*(1+t*r);

        System.out.println("Total amount is : "+ Interest);

    }


}

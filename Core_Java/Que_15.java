/* 15.	Accept person’s gender (character m for male and f for female), age (integer),
as input and then check whether person is eligible for marriage or not.*/

package com.company;

import java.util.Scanner;

public class Que_15 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Gender M/F");
        String Gender= input.next();

        System.out.println("Enter Age");
        int Age= input.nextInt();

        if(Gender.equals("M") && Age>=21)
        {
            System.out.println("person is eligible for marriage ");

        }else if(Gender.equals("F") && Age>=18)
        {
            System.out.println("person is eligible for marriage ");

        }else
        {
            System.out.println("person is not eligible for marriage ");

        }

    }

}

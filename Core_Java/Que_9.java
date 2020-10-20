/* 09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class.
Now convert the entered days into complete years, months and days and print them.
 */
package com.company;

import java.util.Scanner;

public class Que_9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter days");
        int Days=input.nextInt();
        int yr = Days/365;
        System.out.println("Years are : "+yr);

        int month = Days%365;

        if (month>=30)
        {
            int m = month/30;
            System.out.println("Months are : "+m);
            int day=month%30;
            if(day!=0)
            {
                System.out.println("Days are : "+day);
            }else
            {
                System.out.println("Days are : 0");
            }



        }else
        {
            System.out.println("Months are : 0");
            System.out.println("Days are : 0");

        }




    }


}

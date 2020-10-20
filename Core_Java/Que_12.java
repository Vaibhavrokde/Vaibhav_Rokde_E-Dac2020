/* 12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000,
then HRA = 10% of basic salary and DA = 90% of basic salary.
If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary.
If the employee's salary is input by the user write a program to find his gross salary.
[ formula : GS= Basic + DA + HRA ]*/

package com.company;

import java.util.Scanner;

public class Que_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Basic Salary");

        int BS=input.nextInt();

        if(BS<1000)
        {
            float HRA= BS+ ((10/100)*BS);
            float DA = BS+((90/100)*BS);

            System.out.println("Gross Salary is: "+(BS+HRA+DA));

        }else
        {

            float HRA= 2000;
            float DA = BS+((98/100)*BS);

            System.out.println("Gross Salary is: "+(BS+HRA+DA));
        }


    }
}

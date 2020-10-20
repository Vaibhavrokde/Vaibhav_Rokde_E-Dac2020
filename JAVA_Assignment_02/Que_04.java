/* 4.	Calculate  series : 12+22+32+42+.........+n2 */

package com.company;

import java.util.Scanner;

public class Que_04 {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number for series ");
        int num = input.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            int c=10;
            int counter=(c*i)+2;
            //System.out.print(counter+" +");
            sum=sum+counter;

        }//System.out.println();

        System.out.println("Total Sum is : "+sum);


    }
}

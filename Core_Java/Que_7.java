/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage.
        Take the obtained marks from user using Scanner class.
        Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/

package com.company;

import java.util.Scanner;

public class Que_7 {

    static void percentahge (int Marks[])
    {
        int sum=0;

        for(int i:Marks)
        {
            sum=sum+i;

        }
        System.out.println(" Total Marks is "+ sum);

        System.out.println(" percentage marks = "+ sum/Marks.length +" %");

    }


    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

       int  Marks[] = new int[5];



        for(int i=0;i<Marks.length;i++)
        {
            Marks[i]= Input.nextInt() ;
        }

        percentahge(Marks);



    }



}

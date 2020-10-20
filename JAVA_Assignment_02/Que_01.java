/*1	Write a program to print table of any entered number using loop.*/

package com.company;

import java.util.Scanner;

public class Que_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int Num= input.nextInt();

        for(int i=1;i<=10;i++)
        {
            int tb=i*Num;
            System.out.println(tb);
        }

    }






}

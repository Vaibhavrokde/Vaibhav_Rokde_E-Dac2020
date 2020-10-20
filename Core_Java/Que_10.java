/* 10.	Write a program to convert temperature from Fahrenheit to Celsius.
Take Fahrenheit as input using Scanner class.
[ formula : C= 5*(f-32)/9 ]*/

package com.company;

import java.util.Scanner;

public class Que_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter Temperature in Fahrenheit");
        float F= input.nextFloat();

        System.out.println("Temperature in degree :"+ 5*(F-32)/9);

    }

}

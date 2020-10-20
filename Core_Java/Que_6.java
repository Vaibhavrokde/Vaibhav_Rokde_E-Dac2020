/* 06.	Write a program that takes radius of a circle as input.
 Read the entered radius using Scanner class.
 Then calculate and print the area and circumference of the circle.
 */

package com.company;

import java.awt.geom.Area;
import java.util.Scanner;

public class Que_6 {

     static void Circal_Area (double pie,int R)
    {
        double area= pie*R*R;
        System.out.println("Area is: " +area);
    }
     static void circumference (double pie,int R)
    {
        double area= pie*(2+R);
        System.out.println("circumference is: " +area);
    }


    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        double pie= 3.141592653589793238462643383279;
        System.out.println("Enter  Value of radius");
        int R =input.nextInt();

        Circal_Area(pie,R);
        circumference(pie,R);

    }



}

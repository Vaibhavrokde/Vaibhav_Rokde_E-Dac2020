/*9.) Write a program to search an element in the array.*/

package com.company;

import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args)
    {

        int num,findNum,flag=0,i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        num= sc.nextInt();
        int arr[] = new int [num];
        System.out.println("Enter array elements:");
        for( i=0;i<num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to find:");
        findNum=sc.nextInt();
        for(i=0;i<num;i++)
        {
            if(arr[i]==findNum)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }

        }
        if(flag==1)
        {
            System.out.println("Element found at pos:"+(i+1));
        }
        else
        {
            System.out.println("Element not found");
        }


    }

}

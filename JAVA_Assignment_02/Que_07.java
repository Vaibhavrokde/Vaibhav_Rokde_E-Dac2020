/* 7.	Sort a ten element array in descending order.*/

package com.company;

public class Que_07 {

    public static void main(String[] args)
    {
        int[] a = {10, 20, 30, 40, 50, 60,70,80,90,100};
        int temp;

        System.out.println("Before Reversing");

        for (int i = 0; i < a.length- 1; i++)
        {

            System.out.print(a[i] + ",");

        }
        System.out.println();

        for (int i = 0; i <a.length; i++)
        {

            for (int j = i + 1; j <a.length; j++)

            {

                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        System.out.print("Descending Order:");

        for (int i = 0; i < a.length- 1; i++)

        {

            System.out.print(a[i] + ",");

        }

        System.out.print(a[a.length - 1]);

    }
}

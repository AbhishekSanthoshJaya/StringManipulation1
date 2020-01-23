package com.home;

import java.util.Scanner;

public class StringManipulation1
{

public static void main(String[] args)
       {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter your text: ");
    String name = input.nextLine();

    for (int i = 0; i<=name.length(); i++)
    {
        for (int j = 0; j < i; j++)
        {
            System.out.printf("%c ",name.charAt(j));

        }

        System.out.println();
    }
        }

}

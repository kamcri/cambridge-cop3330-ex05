/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first number? ");
        String num1 = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("What is the second number? ");
        String num2 = sc2.nextLine();

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;

        System.out.println(num1 + "+" + num2 + "=" + sum +"\n" +
                           num1 + "-" + num2 + "=" + difference + "\n" +
                           num1 + "*" + num2 + "=" + product + "\n" +
                           num1 + "/" + num2 + "=" + quotient);

        sc.close();
        sc2.close();
    }
}

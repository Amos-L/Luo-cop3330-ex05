/*
 *  UCF COP3330 Fall 2021 Assignment 1.5 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the first number? "); //Asking for user input
        int num1 = x.nextInt(); //Storing user input
        System.out.print("What is the second number? ");
        int num2 = x.nextInt();

        int sum = num1 +num2; //Doing simple math
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.printf("%d + %d = %d \n%d - %d = %d \n", num1, num2, sum, num1, num2,sub ); //Printing"
        System.out.printf("%d * %d = %d\n%d / %d = %d\n", num1, num2, mul, num1, num2,div); //Printing
    }
}
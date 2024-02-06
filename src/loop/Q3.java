package loop;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//        Write a program that prompts the user to input a positive integer.
//        It should then print the multiplication table of that number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number only:");
        int pos= sc.nextInt();

        for (int  i= 1; i<=10; i++)
        {
            System.out.println( pos + " X " + i + " = " + (pos * 1));
        }
    }
}

package condition;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        1. Write a Java program to get a number from the user and print whether it is
//        positive or negative.
//
//        Input number: 35
//        Expected Output :
//        Number is positive

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter your number i will tell you it is positive or negative");
        int num= sc.nextInt();

        if (num>0)
        {
            System.out.println("Number is positive");
        } else if (num<0) {
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is zero");
        }
    }
}

package loop;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
       // Write a program to find the factorial value of any number entered through the keyboard.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your number");
//        int number = sc.nextInt();
//
//        long fact = 1;
//
//        int i = 1;
//        while (i<number)
//        {
//            fact= fact*i;
//            i++;
//        }
//        System.out.println("Factorial number :" + fact);

        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        for(int i=1; i<=num; i++)
        {
            fact *= i;
        }

        System.out.println("Factorial: "+ fact);

    }
}

package condition;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
//        3. Write a Java program that takes three numbers from the user and prints the greatest number.
//
//        Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your 1st no.");
        int num1= sc.nextInt();
        System.out.println(" Enter your 2nd no.");
        int num2= sc.nextInt();
        System.out.println(" Enter your 3rd no.");
        int num3= sc.nextInt();

        if (num1>num2 && num1> num3)
        {
            System.out.println("Greatest no: "+num1);
        }
        else if (num2>num1 && num2> num3)
        {
            System.out.println("Greatest no: "+num2);
        }
        else
        {
            System.out.println("Greatest no: "+num3);
        }
    }
}

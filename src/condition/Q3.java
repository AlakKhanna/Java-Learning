package condition;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
//        5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
//
//        Input number: 3
//        Expected Output :
//        Wednesday

        Scanner sc = new Scanner( System. in);
        System.out.println(" Please enter the no, i will tell you which day it is :");
        int day = sc.nextInt();

        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
        }
    }

}

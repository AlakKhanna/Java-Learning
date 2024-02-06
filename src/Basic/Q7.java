package Basic;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
//        7. Write a Java program that takes a number as input and prints its multiplication
//        table up to 10.
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//...
//        8 x 10 = 80

        Scanner sc =  new Scanner(System.in);
        System.out.println(" Enter any no., I will print the table");
        int num = sc.nextInt();
        int table = 0;

        for (int i = 1; i<=10; i++)
        {
            table= num * i;
            System.out.println( num + " X " + i + " = " + table);
        }
    }
}

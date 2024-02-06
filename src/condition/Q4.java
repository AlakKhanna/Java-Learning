package condition;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
//        6. Write a Java program that reads two floating-point numbers and tests whether
//        they are the same up to three decimal places.

//        Input floating-point number: 25.586
//        Input floating-point another number: 25.589
//        Expected Output :
//        They are different

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st float number");
        float f1=sc.nextFloat();

        System.out.println("Enter your 2nd float number");
        float f2=sc.nextFloat();


//        float f1 = 25.586f;
//        float f2= 25.589f;

        if (f1== f2)
        {
            System.out.println("Both float are same");
        }
        else
        {
            System.out.println("Both are different");
        }
    }
}

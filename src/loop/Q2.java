package loop;

public class Q2 {
    public static void main(String[] args) {
       // Write a program to calculate the sum of first 10 natural number.

        int x = 0;
        for (int i=1; i<=10; i++)
        {
            x= i + x;
        }
        System.out.println(x);
//        int sum = 0;
//        for(int i=1; i<=10; i++)
//        {
//            sum += i;
//        }
//        System.out.println("Sum: " + sum);
    }
}

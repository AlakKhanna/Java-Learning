package loop;

public class Pattern23 {
    public static void main(String[] args) {

        for (int i = 1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print((char) (96+j));
            }
            System.out.println();
        }
    }
}

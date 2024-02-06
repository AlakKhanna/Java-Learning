package loop;

public class Pattern4 {
    public static void main(String[] args) {

        for (int i = 1; i<=4; i++)
        {
            for (int j = 3; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int h = 1; h<=i; h++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

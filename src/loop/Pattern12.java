package loop;

public class Pattern12 {
    public static void main(String[] args) {

        for (int i = 1; i<=4; i++)
        {
            for (int k =1; k<=i; k++)
            {
                System.out.print(" ");
            }
            for (int j= 4; j>=i; j--)
            {
                if (j == 4) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            for( int l = 3; l>=i; l--)
            {
                if ( i >= 2 && l <= i - 1)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }
}
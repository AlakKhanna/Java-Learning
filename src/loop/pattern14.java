package loop;

public class pattern14 {
    public static void main(String[] args) {

        for (int i =0; i<=4; i++)
        {
            for (int j =0; j<=8; j++)
            {
                if ((i-j==0)||(i+j==8))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.print("");
            }
            System.out.println();
        }

        for (int i =0; i<=4; i++)
        {
            for (int j =0; j<=8; j++)
            {
                if ((i+j==4)|| (j-i==4))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
}

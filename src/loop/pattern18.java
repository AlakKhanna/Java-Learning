package loop;

public class pattern18 {
    public static void main(String[] args) {

        for (int i =1; i<=5; i++)
        {
            for (int j= 5; j>=i; j--)
            {
                if (i==1)
                {
                    System.out.print("5");
                } else if (i==2)
                {
                    System.out.print("4");
                }
                else if (i==3)
                {
                    System.out.print("3");
                }
                else if (i==4)
                {
                    System.out.print("2");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

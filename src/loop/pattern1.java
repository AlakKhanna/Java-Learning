package loop;

public class pattern1 {
    public static void main(String[] args) {


        //divide in rows & columns
        //row increase
        //column-1,2,3,4

        for (int i =1; i<=4;i++)//rows k liye yeh humesha constant rhegi
        {
            for (int j= 1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}

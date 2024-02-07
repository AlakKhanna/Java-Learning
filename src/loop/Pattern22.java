package loop;

public class Pattern22 {
    public static void main(String[] args) {
        for ( int i =3; i>=1; i--)
        {
            for (int j =1; j<=2*i; j ++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

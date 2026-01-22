import java.util.Scanner;
public class Main {

    public static void main (String[] args)
    {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int count=0;
        for ( int i=0;i<n;i++)
        {
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            int sum = a+b+c;
            
            if ( sum>=2)
            {
                count++;
            }

        }
        System.out.println(count);
    }
}

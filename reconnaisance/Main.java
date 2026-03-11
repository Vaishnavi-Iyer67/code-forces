import java.util.*;
public class Main {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
         long[] a = new long[n];

        for(int i=0;i<n;i++)
        {
            a[i] =sc.nextInt();

        }
        long count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && Math.abs(a[i]-a[j])<=d)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
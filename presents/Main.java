import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int[] ans = new int[n+1];
        for( int i=1;i<=n;i++)
        {
            int x = sc.nextInt();
            ans[x]=i;


        }
        for ( int i=1;i<=n;i++)
        {
            System.out.print(ans[i]+" ");
        }
            
    }
}
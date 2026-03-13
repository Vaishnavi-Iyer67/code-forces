import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            if(n==2)
            {
                System.out.println(2);
            }
            else if(n%2==1)
            {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
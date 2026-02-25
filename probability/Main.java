import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int m = Math.max(Y,W);
        int favourable = 6-m+1;
        int total = 6;
        int g = gcd(favourable,total);
        System.out.println((favourable / g) + "/" + (total / g));
    }
        // Method to calculate GCD
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }



    
}
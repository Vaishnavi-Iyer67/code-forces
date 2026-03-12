import java.util.*;

public class Main {

    static boolean isPrime(int num){
        if(num < 2) return false;

        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = n + 1; i <= 50; i++){
            if(isPrime(i)){
                if(i == m){
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                break;
            }
        }
    }
}
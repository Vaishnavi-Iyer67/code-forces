import java.util.Scanner;
// 71 -A 
// rating 800 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();

            if (s.length() <= 10) {
                System.out.println(s);
            } else {
                System.out.println(
                    s.charAt(0) +
                    "" +
                    (s.length() - 2) +
                    s.charAt(s.length() - 1)
                );
            }
        }
    }
}

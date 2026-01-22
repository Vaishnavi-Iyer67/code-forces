import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        while (n-- > 0) {
            String s = sc.nextLine();

            if (s.length() > 10) {
                System.out.println(
                    s.charAt(0) + "" + (s.length() - 2) + s.charAt(s.length() - 1)
                );
            } else {
                System.out.println(s);
            }
        }
        sc.close();
    }
}

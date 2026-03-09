import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] flag = new char[n][m];

        for(int i = 0; i < n; i++){
            String row = sc.next();
            for(int j = 0; j < m; j++){
                flag[i][j] = row.charAt(j);
            }
        }

        boolean valid = true;

        for(int i = 0; i < n; i++){
            
            // Check if row has same color
            for(int j = 1; j < m; j++){
                if(flag[i][j] != flag[i][0]){
                    valid = false;
                }
            }

            // Check if adjacent rows are different
            if(i > 0 && flag[i][0] == flag[i-1][0]){
                valid = false;
            }
        }

        if(valid) System.out.println("YES");
        else System.out.println("NO");
    }
}
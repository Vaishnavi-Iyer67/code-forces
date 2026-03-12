import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
                rowSum[i] += matrix[i][j];
                colSum[j] += matrix[i][j];
            }
        }

        int count = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(colSum[j] > rowSum[i])
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
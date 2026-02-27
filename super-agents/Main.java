import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] grid = new char[3][3];
        for( int i=0; i<3; i++)
        {
            String line = sc.nextLine();
            for( int j=0;j<3;j++)
            {
                grid[i][j]=line.charAt(j);
            }

        }
        boolean result = true;
        for( int i=0;i<3 && result ;i++)
        {
            for ( int j=0;j<3;j++)
            {
                if(grid[i][j]!= grid[2-i][2-j])
                {
                    result = false;

                }
            }
        }
        if(result)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        sc.close();
    }
}
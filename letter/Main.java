import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] grid = new char[n][m];
        for( int i=0;i<n;i++)
        {
            String line = sc.nextLine();
            for(int j=0;j<m;j++)
            {
                grid[i][j]=line.charAt(j);

            }
        }
        // to find the smallest rectangle which contains all the stars or colored boxes 
        // while finding something min intialize it to large value 
        // while finding max initialize to small value 
        int minrow = n;
        int mincol=m;
        int maxrow=0;
        int maxcol=0;

        for( int i=0;i<n;i++)
        {
            for( int j =0;j < m;j++)
            {

                if( grid[i][j]=='*')
                {
                    minrow = Math.min(minrow,i);
                    mincol=Math.min(mincol,j);
                    maxrow=Math.max(maxrow,i);
                    maxcol=Math.max(maxcol,j);
                }
            }
        }
        // print the min rec 
        for( int i =minrow;i<=maxrow;i++)
        {
            for( int j=mincol;j<=maxcol;j++)
            {
                System.out.print(grid[i][j]);
            }
             System.out.println();
        }
        sc.close();
        
    }
    
    
}

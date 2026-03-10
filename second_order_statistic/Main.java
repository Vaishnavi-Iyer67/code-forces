import java.util.*;
public class Main {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] num= new int[n];

        for( int i=0;i<n;i++)
        {
            num[i] =sc.nextInt();

        }
        Arrays.sort(num);
        int j=0;
        for( int i=0;i<n;i++)
        {
            if(num[i]!=num[j])
            {
                j++;
                num[j]=num[i];

            }
        }
        int count =j+1;
        if(count<2)
        {
            System.out.println("NO");
        }
        else {
            System.out.println(num[1]);
        }
            
        

        
    }
    
}
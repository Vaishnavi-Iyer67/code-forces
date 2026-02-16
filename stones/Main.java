// 266 A 
// rating 800 
import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int count=0;
      for ( int i=1;i<n;i++)
      {
         if(s.charAt(i)==s.charAt(i-1)){

         
         count++;
         }

      }
      System.out.println(count);


       
      
   }
  

    
}

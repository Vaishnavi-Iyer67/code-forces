import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] Arr = s.toCharArray();
        Arrays.sort(Arr);
        for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]!='+')
            {
                System.out.print(Arr[i]);
            }
            else{
                if(i<Arr.length-1)
                {
                    System.out.print("+");
                }
            }
            }
        }


    }
    


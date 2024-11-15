import java.util.*;
public class bitplus{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        while(n != 0)
        {
            String s=sc.next();
            if(s.contains("++"))
            {
                x++;
            }
            if(s.contains("--"))
            {
                x--;
            }
            n--;
        }
        System.out.println(x);
    }
}

import java.util.*;

final public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        char prev=s.charAt(0);
        for(int i=1;i<n;i++)
        {
            if(prev == s.charAt(i)) count++;
            prev=s.charAt(i);
        }
        System.out.println(count);
    }
}

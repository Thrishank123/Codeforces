import java.util.*;
public final class Main{
    public static int lexo(String s1,String s2)
    {
        if(s1.compareTo(s2) > 0)
        {
            return 1;
        }
        else if(s1.compareTo(s2) < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int result=lexo(s1,s2);
        System.out.println(result);
    }
}

import java.util.*;

final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int[] counting=new int[test];
        for(int i=0;i<test;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a%b == 0)
            {
                counting[i]=0;
            }
            else counting[i]=b-(a%b);
        }
        for(var x: counting)
        {
            System.out.println(x);
        }
        sc.close();
    }
}

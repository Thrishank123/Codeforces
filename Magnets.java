import java.util.Scanner;

final public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int count=1;
        int prev=sc.nextInt();
        for(int i=1;i<test;i++)
        {
            int number=sc.nextInt();
            if(number != prev)
            {
                count++;
                prev=number;
            }
        }
        System.out.println(count);
    }
}

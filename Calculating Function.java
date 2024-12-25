import java.util.Scanner;

final public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long test=sc.nextLong();
        if(test%2 == 0) System.out.println(test/2);
        else System.out.println(-(test/2+1));
        sc.close();
    }
}

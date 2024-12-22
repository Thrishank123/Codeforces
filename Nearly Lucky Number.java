import java.util.Scanner;
final public class Main {
    public static boolean lucky(long n)
    {
        while(n!=0)
        {
            long digit=n%10;
            n=n/10;
            if(digit == 7 || digit ==4) continue;
            else return false;
        }
        return true;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           long number=sc.nextLong();
           long count=0;
           while(number!=0)
           {
               long digit=number%10;
               number=number/10;
               if(digit == 7 || digit == 4) count++;
           }
           if(lucky(count) && count != 0) System.out.println("YES");
           else System.out.println("NO");
    }
}

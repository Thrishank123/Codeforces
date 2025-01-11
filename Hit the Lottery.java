import java.util.*;

final public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] denominations={1,5,10,20,100};
        int change=0;
        int j=4;
        while(n != 0)
        {
            int number=denominations[j];
            int num=n/number;
            change+=num;
            n = n % denominations[j];
            j--;
        }
        System.out.println(change);
        sc.close();
    }
}

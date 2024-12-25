import java.util.*;
final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        for(int i=0;i<t;i++)
        {
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(q-p >= 2) count++;
        }
        System.out.println(count);
    }
}

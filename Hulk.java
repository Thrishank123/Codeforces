import java.util.*;

final public class Main {
    public static void main(String[] args) {
        String odd="I hate that ";
        String even="I love that ";
        String result="";
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2 == 0) result+=even;
            else result+=odd;
        }
        String output=result.substring(0,result.length()-5);
        System.out.println(output+"it");
        sc.close()
    }
}

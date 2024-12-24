import java.util.Scanner;
final public class Main {
    public static void main(String[] args) {
        int maxi=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            total-=x;
            total+=y;
            maxi=Math.max(maxi,total);
        }
        System.out.println(maxi);
    }
}

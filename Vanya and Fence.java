import java.util.Scanner;

final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int[] arr=new int[n];
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i] > h) maxi+=2;
            else maxi++;
        }
        System.out.println(maxi);
    }
}

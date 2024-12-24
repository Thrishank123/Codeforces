import java.util.Scanner;

final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        String result="EASY";
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i] == 1) result="HARD";
        }
        System.out.println(result);
    }
}

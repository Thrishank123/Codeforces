import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        int x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int number=sc.nextInt();
            arr[number-1]=0;
        }
        int y=sc.nextInt();
        for(int i=0;i<y;i++)
        {
            int number=sc.nextInt();
            arr[number-1]=0;
        }
        String result="I become the guy.";
        for(int i=0;i<n;i++)
        {
            if(arr[i] == 1)
            {
                result="Oh, my keyboard!";
                break;
            }
        }
        System.out.println(result);
    }
}

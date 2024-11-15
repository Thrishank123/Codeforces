import java.util.*;
 
public final class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int x=nums[k-1];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>= x && nums[i]>0) count++;
        }
        System.out.println(count);
    }
}

import java.util.*;
final public class Solution{
    public static void main(String[] args)
    {
        int x=0;
        int y=0;
        Scanner sc=new Scanner(System.in);
        int[][] nums=new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                nums[i][j]=sc.nextInt();
                if(nums[i][j] == 1)
                {
                    x=i+1;
                    y=j+1;
                }
            }
        }
        int result=Math.abs(x-3)+Math.abs(y-3);
        System.out.println(result);
    }
}

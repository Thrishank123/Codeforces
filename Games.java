import java.util.*;
final class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int[][] teams=new int[number][2];
        for(int i=0;i<teams.length;i++)
        {
            teams[i][0]=sc.nextInt();
            teams[i][1]=sc.nextInt();
        }
        
        int count=0;
        for(int i=0;i<teams.length;i++)
        {
            int[] home=teams[i];
            for(int j=0;j<teams.length;j++){
                if(j == i) continue;
                int[]guest=teams[j];
                if(home[0] == guest[1]) count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int[] arr=new int[n];
        int maxpos=-1;
        int minipos=-1;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(maxi<arr[i])
            {
                maxi=arr[i];
                maxpos=i;
            }
            if(mini>=arr[i])
            {
                mini=arr[i];
                minipos=i;
            }
        }
        if(maxpos == 0 && minipos== n-1)
        {
            System.out.println(0);
            return;
        }
        int swap=(n-1-minipos)+maxpos;
        if(minipos<maxpos) swap--;
        
        System.out.println(swap);
    }
}

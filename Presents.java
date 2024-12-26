import java.util.*;
final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int member=sc.nextInt();
        int[] arr=new int[member];
        for(int i=0;i<member;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] result=new int[member];
        for(int i=0;i<member;i++)
        {
            result[arr[i]-1]=i+1;
        }
        for(var x: result)
        {
            System.out.print(x+" ");
        }
        sc.close();
    }
}

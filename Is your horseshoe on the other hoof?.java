import java.util.*;
final public class Main {
    public static void main(String[] args) {
        HashSet<Integer> st=new HashSet<>();
        int[] arr= new int[4];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<4;i++)
        {
            if(st.contains(arr[i])) count++;
            else
            {
                st.add(arr[i]);
            }
        }
        System.out.println(count);
    }
}

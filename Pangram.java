import java.util.*;

final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        s=s.toLowerCase();
        HashSet<Character> st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            st.add(s.charAt(i));
        }
        if(st.size() == 26) System.out.println("YES");
        else System.out.println("NO");
    }
}

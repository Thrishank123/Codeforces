import java.util.*;

public final class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> st=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) <=122 && s.charAt(i) >= 97) st.add(s.charAt(i));
        }
        System.out.println(st.size());
        sc.close();
    }
}

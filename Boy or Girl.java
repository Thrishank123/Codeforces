import java.util.*;
final public class Main {
    public static void main(String[] args) {
        HashSet<Character> st=new HashSet<>();
        Scanner sc =new Scanner(System.in);
        String word=sc.next();
        for(int i=0;i<word.length();i++)
        {
            if(!st.contains(word.charAt(i)))
            {
                st.add(word.charAt(i));
            }
        }
        int len=st.size();
        if(len%2 == 0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }
    }
}

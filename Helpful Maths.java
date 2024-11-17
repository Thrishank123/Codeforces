import java.util.*;
public final class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        if (s1.length() == 1){
            System.out.println(s1);
        }
        else
        {
            ArrayList<Character> numbers=new ArrayList<>();
            for(int i=0;i<s1.length();i++){
                char x=s1.charAt(i);
                if(x != '+') numbers.add(x);
            }
            Collections.sort(numbers);
            String result="";
            for(int i=0;i<numbers.size()-1;i++)
            {
                result+=numbers.get(i);
                result+="+";
            }
            result+=numbers.get(numbers.size()-1);
            System.out.println(result);
        }
    }
}

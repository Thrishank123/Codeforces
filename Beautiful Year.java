import java.util.*;

final public class Main {
    public static boolean isValid(int year)
    {
        HashSet<Integer> st= new HashSet<Integer>();
        while(year!=0)
        {
            int digit=year%10;
            year=year/10;
            if(st.contains(digit)) return false;
            else st.add(digit);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        y++;
        while(true)
        {
            if(isValid(y)) break;
            else y++;
        }
        System.out.println(y);
    }
}

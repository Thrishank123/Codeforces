import java.util.*;
final public class Main {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        String first=word.toUpperCase();
        str.append(first.charAt(0));
        for(int i=1;i<word.length();i++)
        {
            str.append(word.charAt(i));
        }
        System.out.println(str.toString());
    }
}

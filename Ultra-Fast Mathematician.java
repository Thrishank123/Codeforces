import java.util.Scanner;

final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word1=sc.next();
        String word2=sc.next();
        String result="";
        for(int i=0;i<word1.length();i++)
        {
            if(word1.charAt(i) != word2.charAt(i))
            {
                result+="1";
            }
            else
            {
                result+="0";
            }
        }
        System.out.println(result);
    }
}

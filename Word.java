import java.util.*;
class Main {
    public static void main(String[] args) {
        int ucase=0;
        int lcase=0;
        Scanner sc=new Scanner(System.in);
        String word=sc.next();
        for(int i=0;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i))) ucase++;
            else lcase++;
        }
        if(lcase >= ucase)
        {
            System.out.println(word.toLowerCase());
        }
        else
        {
            System.out.println(word.toUpperCase());
        }
        sc.close();
    }
}

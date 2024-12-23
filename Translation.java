import java.util.Scanner;
final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String rev=sc.next();
        StringBuilder res = new StringBuilder();
        res.append(rev);
        res.reverse();
        String result=res.toString();
        if(s.equals(result)) System.out.println("YES");
        else System.out.println("NO");
    }
}

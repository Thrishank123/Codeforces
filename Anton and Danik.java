import java.util.Scanner;
final public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == 'A') count1++;
            else count2++;
        }
        if(count1>count2) System.out.println("Anton");
        else if(count1 == count2) System.out.println("Friendship");
        else System.out.println("Danik");
    }
}

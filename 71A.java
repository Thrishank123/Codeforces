import java.util.*;
public final class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String[] arr=new String[number];
        for(int i=0;i<number;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<number;i++)
        {
        String temp=arr[i];
        if(temp.length() > 10)
        {
            String s="";
            char x=temp.charAt(0);
            s+=x;
            s+=(temp.length()-2);
            x=temp.charAt(temp.length()-1);
            s+=x;
            System.out.println(s);
        }
        else{
            System.out.println(temp);
        }
        }

    }
}

import java.util.*;
public final class Solution
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int number =sc.nextInt();
    if(number%2 == 0 && number>2) System.out.println("YES");
    else System.out.println("NO");
    sc.close();
  }
}

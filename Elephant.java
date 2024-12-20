import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxStep = 5;
        int count = 0;
        while (n > 0) {
            if (n >= maxStep) {
                count += n / maxStep;
                n %= maxStep;   
            }
            maxStep--; 
        }
        System.out.println(count);
    }
}

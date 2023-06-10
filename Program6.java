import java.util.*;
public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a<b?a:b;
        System.out.println("Minimum number: "+c);
        sc.close();
    }
}

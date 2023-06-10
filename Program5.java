import java.util.*;
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int a = n%2==0?0:1;
        System.out.println(a);
        sc.close();
    }
}

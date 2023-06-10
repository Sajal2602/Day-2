import java.util.*;
public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a<b?a<c?a:c:b<c?b:c;
        System.out.println("TMinimum : "+d);
        sc.close();
    }
}

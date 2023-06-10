import java.util.*;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println((n%5==0 && n%11==0)?"1":"0");
        sc.close();
    }
}

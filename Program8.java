import java.util.*;
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lengths of the sides of the triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b==c)
            System.out.println("Equilateral Triangle");
        else if(a!=b && b!=c && c!=a)
            System.out.println("Scalene Triangle");
        else
            System.out.println("Isosceles Traingle");
        sc.close();
    }
}

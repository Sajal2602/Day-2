import java.util.*;
public class Program10 {
    public static void main(String[] args) {
        int bal = 2000;
        System.out.println("Balance : "+bal);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for credit and 2 for debit: ");
        int n = sc.nextInt();
        int w;
        if(n == 1){
            System.out.print("Enter the amount to be credited : ");
            w = sc.nextInt();
            System.out.println("Balance : "+(bal+w));
        }
        else if(n == 2){
            System.out.print("Enter the amount to be debited : ");
            w = sc.nextInt();
            if(w > bal)
                System.out.println("Insufficient Funds!");
            else
                System.out.println("Balance : "+(bal-w));
        }
        sc.close();
    }
}

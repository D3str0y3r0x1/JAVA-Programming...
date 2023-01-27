import java.util.Scanner;

public class Add {
    public static void main(String args[]) {
        Scanner rs = new Scanner(System.in);
        System.out.print("A:");
        int a = rs.nextInt();
        System.out.print("B:");
        int b = rs.nextInt();
        int sum = a*b;
        System.out.println("sum:" + sum);
        
    }

    
}

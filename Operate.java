import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Operate {
    public static void main(String args[]){

        //Binary operators
        // Scanner vs = new Scanner(System.in);
        //  System.out.print("A:");
        //  int A = vs.nextInt();
        //  System.out.print("B:");
        //  int B = vs.nextInt();
        //  System.out.println("add:" + (A+B));
        //  System.out.println("subtract:" + (A-B));
        //  System.out.println("multiply:" + (A*B));
        //  System.out.println("modulo:" + (A%B));




    // Unary operators
            // Scanner vs = new Scanner(System.in);
            // System.out.print("A:");
            // int A = vs.nextInt();
            // int B = --A;
            // System.out.println(A);
            // System.out.println(B);
    // Relational Operators
        Scanner vs = new Scanner(System.in);
        System.out.print("A:");
        int A = vs.nextInt();
        System.out.print("B:");
        int B = vs.nextInt();
        System.out.println("is equal:" + (A==B));
        System.out.println("is not equal:" + (A!=B));
        System.out.println("is greater:" + (A>B));
        System.out.println("is not greater:" + (A<B));
        System.out.println("is it matches:" + (A<=B));
        System.out.println("is it not matches:" + (A>=B));
        System.out.print("F:");
        int F = vs.nextInt();
        System.out.print("G:");
        int G = vs.nextInt();
        G /= 25 ;
        F  -= 10;
        System.out.println("F:" + F);
        System.out.println("G:" + G);

        
     }
    
}

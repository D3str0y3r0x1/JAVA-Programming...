import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.xml.transform.Source;

public class Nestedloop {
    public static void main(String args[]){
        // Star pattern
        // Scanner vs = new Scanner(System.in);
        // System.out.print("how many rows should print :");
        // int num = vs.nextInt();
        // for(int i = 1;i<=num;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        

        //inverted Star pattern
        Scanner vs = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = vs.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}

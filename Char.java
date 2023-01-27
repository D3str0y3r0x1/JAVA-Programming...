import java.util.Scanner;

public class Char {
    public static void main(String args[]){
        Scanner vs = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = vs.nextInt();
        char ch = 'A';

        for(int i =1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        
    }
    
}

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        Scanner vs = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = vs.nextInt();
        if(n==2){
            System.out.println("the given number is prime");

        }else{
            boolean isPrime = true;
            for(int i = 2;i<=n-1;i++){
                if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime=true){
                System.out.println("the given number is prime");
            }else{
                System.out.println("the given number is not a prime");
            }
            
    
        }
    }
    
}

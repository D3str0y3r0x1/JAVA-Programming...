import java.util.Scanner;

public class Reverse {
    public static void main(String args[]){
        Scanner vs = new Scanner(System.in);
        int n = vs.nextInt();
        int rev = 0;
        while(n > 0 ){
            int sum = n % 10;
            rev = (rev*10)+sum;
             n = n / 10;

        }
        System.out.println(rev);
        
     }
}
    


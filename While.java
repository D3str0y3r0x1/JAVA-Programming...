import java.util.Scanner;

public class While{
    public static void main(String args[]){
        Scanner vs = new Scanner(System.in);
        System.out.print("enter a number to repeat the statement:");
        int num = vs.nextInt();
        int sum = 0;
        int count = 1;
        while(count<=num){
            sum = sum+count;
            count++;
            
        }
        System.out.println(sum);
    }
}
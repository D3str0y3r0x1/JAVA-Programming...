import java.util.Scanner;

public class Multi {
    public static void main(String args[]){
        Scanner vm = new Scanner(System.in);
        System.out.print("a:");
        int a = vm.nextInt();
        System.out.print("b:");
        int b = vm.nextInt();
        long sum = a*b;
        System.out.println(sum);
    }
    
}

import java.util.Scanner;

public class Do {
    public static void main(String args[]){
        Scanner vs = new Scanner(System.in);
        // do{
        //     System.out.print("Enter an number:");
        //     int num = vs.nextInt();
        //     if(num%10==0){
        //         System.out.println(" ");
        //         continue;
        //     }
        //     System.out.println(num);


        // }while(true);
        do{
            System.out.print("Enter an number:");
            int num = vs.nextInt();
            if(num%10==0){
                System.out.println(" ");
                continue;
            }
            System.out.println(num);
        }while(true);
        
        

    
    }
}

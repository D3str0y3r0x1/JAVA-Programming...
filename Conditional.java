import java.text.BreakIterator;
import java.util.Scanner;

public class Conditional {
    public static void main(String args[]){
        // Scanner vs = new Scanner(System.in);
        // System.out.print("enter your age:");
        // int age = vs.nextInt();
        // if(age>=18){
        //     System.out.println("you can vote dude");
        // } 
        // if(age>13 && age<18){
        //     System.out.println("you are a teenager dude");
        // }
        // else{
        //     System.out.println("you r not an adult buddy");
        // }
        Scanner vs = new Scanner(System.in);
        // System.out.print("A:");
        // int A = vs.nextInt();
        // System.out.print("B:");
        // int B = vs.nextInt();
        // if(A>B){
        //     System.out.println("the largest number is:" + A);
        // }
        // if(A==B){
        //     System.out.println("the two given values are equal");
        // }
        // else{
        //     System.out.println("the largest number is:" + B);
        // }
        // System.out.print("enter your number:");
        // int number = vs.nextInt();
        // if(number % 2 == 0){
        //     System.out.println("Your number is even");
        // }
        // else{
        //     System.out.println("Your number is odd");
        // }
        // System.out.print("Enter your age:");
        // int Age = vs.nextInt();
        // if(Age>=18){
        //     System.out.println("You are an adult");
        // }
        // else if(Age>=13 && Age<18){
        //     System.out.println("you are a teenager");
        // }
        // else{
        //     System.out.println("you are children");
        // }
        //Income tax calcutation
    //     System.out.print("income:");
    //    double income;
    //    double  Tax;
    //     income = vs.nextInt();
    //     if(income<500000){
    //         Tax = 0;
    //         System.out.println("Tax : " + Tax);
    //     }
    //     else if(income >= 500000 && income < 1000000){
    //         Tax = income * 0.2;
    //         System.out.println("Tax " + Tax);
    //     }
    //     else{
    //         Tax = income * 0.3;
    //         System.out.println(" Tax " + Tax);
    //     }
    // Largest of three
    // System.out.print("A:");
    // int A = vs.nextInt();
    // System.out.print("B:");
    // int B = vs.nextInt();
    // System.out.print("C:");
    // int C = vs.nextInt();
    // if((A>=B) && (A>=C)){
    //     System.out.println("The largest number is :" + A);
    // }
    // else if(B>=C){
    //     System.out.println("The largest number is :" + B);
    // }
    // else{
    //     System.out.println("The largest number is :" + C);
    // }
    //ternary operator
    // System.out.println("Enter a number : ");
    // int number = vs.nextInt();
    // String type = ((number %2 == 0))?"even":"odd";
    // System.out.println(type);
    // calculating marks
    // System.out.print("Enter your marks:");
    // int marks = vs.nextInt();
    // String Result = (marks>=35)?"pass":"fail";
    // System.out.println(Result);
    // switch statements
    // System.out.print("Enter dish numbr:");
    // int Num = vs.nextInt();
    // switch(Num){
    //     case 1 : System.out.println("Biryani");
    //     break;
    //     case 2 : System.out.println("Shawarma");
    //     break;
    //     case 3 : System.out.println("cool drinks");
    //     break;
    //     default : System.out.println("enter only 3 numbers asshole");
    // }
    System.out.print("A:");
    int A = vs.nextInt();
    System.out.print("B:");
    int B = vs.nextInt();
    System.out.print("Enter the operator:");
    char operator = vs.next().charAt(0);
    switch(operator){
        case '+' : System.out.println(A+B);
        break;
        case '-' : System.out.println(A-B);
        break;
        case '*' : System.out.println(A*B);
        break;
        case '/' : System.out.println(A/B);
        break;
        case '%' : System.out.println(A%B);
        break;
        default : System.out.println("Enter a valid opertor dude");
    }
        
        


    }
    
}

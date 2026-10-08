import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
         Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number:");
        int a = sc.nextInt();
        if(a%3==0 && a%5==0)
        System.out.println("Number is divisible by both:");
        else
        System.out.println("Number is not divisible by both:");

    }
    
}

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter float number:");
        double num = sc.nextDouble();

        int converted= (int) num;
        System.out.println("Float number:"+num);
        System.out.println("converted number:"+converted);


    }
}

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first boolean value (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Enter second boolean value (true/false): ");
        boolean b = sc.nextBoolean();

        System.out.print("Enter logical operator (& for AND, | for OR): ");
        char op = sc.next().charAt(0);

        if (op == '&')
            System.out.println("Result = " + (a && b));
        else if (op == '|')
            System.out.println("Result = " + (a || b));
        else
            System.out.println("Invalid logical operator.");
    }
}
import java.util.Scanner;

public class Variables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int a = sc.nextInt();

        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter the string: ");
        String c = sc.nextLine();

        System.out.print("Enter the float: ");
        float b = sc.nextFloat();

        System.out.println("\nInteger: " + a);
        System.out.println("String: " + c);
        System.out.println("Float: " + b);

        sc.close();
    }
}
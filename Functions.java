import java.util.Scanner;

public class Functions{
    public static void main (String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Sum of two numbers:" + add(a, b));
        System.out.print("Multiplication of two numbers:" + mult(a, b));
    }

    // addition function
    public static int add(int a, int b){
        return a + b;
    }

    // multiplication function
    public static int mult(int a, int b){
        return a*b;
    }
}
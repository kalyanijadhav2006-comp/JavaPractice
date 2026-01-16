import java.util.Scanner;

public class Exponential{
    public static long Power(int x, int n){
        long result = 1;
        for(int i=1; i<=n; i++){
            result = result * x;
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        // user inputs
        System.out.println("Base:" + x);
        System.out.println("Exponent:" + n);

        // function call
        long power = Power(x,n);
        System.out.println("Result:" + power);
    }
}

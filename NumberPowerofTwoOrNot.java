import java.util.Scanner;

public class NumberPowerofTwoOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0 && ((n & (n-1)) == 0)){
            System.out.println("Number is the power of two.");
        }else{
            System.out.println("Number is not power of two.");
        }
    }
}
import java.util.Scanner;

public class FunctionEvenorNot{

    static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(isEven(n)){
            System.out.println(n + " " + "is Even Number");
        }else{
            System.out.println(n + " " + "is Odd Number");
        }
    }
}
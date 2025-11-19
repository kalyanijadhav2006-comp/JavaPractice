import java.util.Scanner;

public class ConditionalStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b){
            System.out.println("Both are equal.");
        }else if(a>b){
            System.out.println("a is grater");
        }else{
            System.out.println("a is lesser");
        }
    }
}
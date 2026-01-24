import java.util.*;

public class IncrementDecrementOperations{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        int x, y;

        //pre-increment
        x = a;
        y = b;
        y = ++x;
        System.out.println("pre-increment:");
        System.out.println("x:" + x);
        System.out.println("y:" + y);
        
        // post - increment
        x = a;
        y = b;
        y = x++;
        System.out.println("post - increment:");
        System.out.println("x:" + x);
        System.out.println("y:" + y);

        //pre-decrement
        x = a;
        y = b;
        y = --x;
        System.out.println("pre-decrement:");
        System.out.println("x:" + x);
        System.out.println("y:" + y);

        //post-decrement
        x = a;
        y = b;
        y = x--;
        System.out.println("post-decrement:");
        System.out.println("x:" + x);
        System.out.println("y:" + y);
    }
}
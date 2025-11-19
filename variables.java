import java.util.Scanner;

public class variables{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // radius of circle
        double pi = 3.14;
        double A = pi * r * r;
        System.out.println("Area of circle is :" + A);
    }
}
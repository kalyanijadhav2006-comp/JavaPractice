import java.util.Scanner;
public class Circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = 5;
        double pi = 3.14;
        double area = pi * r * r;
        System.out.println("Radius of the circle:" + r);
        System.out.println("Area of circle:" + area);
    }
}
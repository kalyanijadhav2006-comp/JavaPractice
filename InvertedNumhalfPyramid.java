import java.util.Scanner;

public class InvertedNumhalfPyramid{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number =1;

        for(int i=n;i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(number);
            }
            System.out.println();
            number++;
        }
    }
}
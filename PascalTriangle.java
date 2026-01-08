import java.util.Scanner;

public class PascalTriangle{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            for(int j=n-i; j>1; j--){
                System.out.print(" ");
            }

            int numbers =1;
            for(int j=0; j<=i; j++){
                System.out.print(numbers + " ");
                numbers = numbers * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
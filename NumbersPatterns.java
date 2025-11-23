import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class NumbersPatterns{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Half Pyramid

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Reverse Half Pyramid 

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Right side Half Pyramid

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

        //Right side Half Reverse Pyramid

        for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }

    }
}


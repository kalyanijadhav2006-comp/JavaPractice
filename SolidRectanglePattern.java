import java.util.Scanner;

public class SolidRectanglePattern{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        //inner loop
        for(int i=1; i<=n; i++){

            //outer loop
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
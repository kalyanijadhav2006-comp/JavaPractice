import java.util.Scanner;

public class PositiveNegativeZeroNumers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int pos = 0, neg = 0, zero = 0;

        while(true){
            System.out.println("Enter the number:");
            int n = sc.nextInt();
            if(n>0){
                pos++;
            }else if(n<0){
            neg++;
            } else{
                zero++;
            }  
            System.out.println("Do you want to continue?(1 = yes, 0 = no)");
            int ch = sc.nextInt();
            if(ch == 0){
                break;
            }
        }
         System.out.println("Positive Numbers:" + pos);
         System.out.println("Negative Numbers:" + neg);
         System.out.println("Zeros:" + zero);
    }
}
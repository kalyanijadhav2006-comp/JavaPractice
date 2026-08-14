import java.util.*;
public class PowerofTwo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0 && (n & (n-1)) == 0){
            System.out.println("Yes" +" "+ n +" "+ "is in the power of 2");
        }else{
            System.out.println("No" +" "+ n +" "+ "is not in the power of 2");
        }
    }
}
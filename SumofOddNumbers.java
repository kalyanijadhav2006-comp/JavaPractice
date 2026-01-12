import java.util.Scanner;

public class SumofOddNumbers{
    static int sum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}


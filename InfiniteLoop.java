import java.util.Scanner;

public class InfiniteLoop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int n = sc.nextInt();
        do{
            System.out.println("there is itteration number:" + count);
            count++;
        }while(count <= n);
    }
} 
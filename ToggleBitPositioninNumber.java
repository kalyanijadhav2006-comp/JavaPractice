import java.util.Scanner;

public class ToggleBitPositioninNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();

        int result = n^(1 << pos);
        System.out.println(result);
    }
}

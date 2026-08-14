import java.util.*;
public class BitToggle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pos = sc.nextInt();

        n = n ^ (1 << pos);
            System.out.println(n);
        
    }
}
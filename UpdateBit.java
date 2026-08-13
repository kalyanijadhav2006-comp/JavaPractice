import java.util.*;
public class UpdateBit{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int op = sc.nextInt(); // either 1(set) or 0(clear)
        int bitmask = 1 << pos;
        
        //for 1
        if(op == 1){
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        }else{

        // for 0
            int newbitmask = ~(bitmask);
            int newNumber = newbitmask & n;
            System.out.println(newNumber);
        }
    }
}
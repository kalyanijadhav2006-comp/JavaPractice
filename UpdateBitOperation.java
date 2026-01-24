import java.util.Scanner;

public class UpdateBitOperation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int op = sc.nextInt();
        int bitMask = 1 << i;
        
        //update bit
        if(op == 1){
        //set operation
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
        //clear operation
            int num = ~(bitMask);
            int updatedNumber = (num & n);
        }
    }
}
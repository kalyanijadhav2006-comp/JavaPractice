import java.util.Scanner;

public class BitManipulationOperations{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int bitMask = 1 << i;

        //Get Operation
        // if((bitMask & n) == 0){
        //     System.out.println("Bit was zero.");
        // }else{
        //     System.out.println("Bit was one.");
        // }

        // //Set Operation
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // Clear Operation(And with Not of BitMask)
        // int num = ~(bitMask);
        // int clearnumber = num & n;
        // System.out.println(clearnumber);
    }
}
import java.util.Scanner;
public class ArrayofStringLength{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String array[] = new String[n];
        int Length = 0;

        for(int i=0; i<array.length; i++){
            array[i] = sc.next();
            Length += array[i].length();
        }
        System.out.println(Length);
    }
}
import java.util.Scanner;

public class ArrayinAscendingOrder{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAscending =false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in Ascending order.");
        }else{
            System.out.println("The array is not sorted in Ascending order.");
        }
    }
}
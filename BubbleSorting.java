import java.util.*;
public class BubbleSorting{
    public static void sort(int n,int arr[]){
         // output array
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];

         // input array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //bubble sorting
        for(int i =0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        sort(n , arr);
    }
}
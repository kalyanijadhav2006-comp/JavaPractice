import java.util.*;
public class InsertionSorting{

    public static void sort(int n, int arr[]){
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        //input
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //sorting 
        for(int i=0; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        sort(n, arr);
    }
}
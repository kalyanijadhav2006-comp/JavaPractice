import java.util.Scanner;

public class InputSearchIndexofArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        //Input 
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        //index of serching element
        int x = sc.nextInt();

        //Output
        for(int i=0; i<n; i++){
            if(a[i] == x){
                System.out.println(x +" is at the index " + i);
            }else{
                System.out.println("Element is not found'");
            }
        }
    }
}
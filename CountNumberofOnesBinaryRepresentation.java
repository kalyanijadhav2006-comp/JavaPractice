import java.util.Scanner;

public class CountNumberofOnesBinaryRepresentation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int count = 0;
        int temp = n;

        while(temp > 0){
             if(temp % 2 == 1){
                count++;
             }
             temp = temp / 2;
        }
        System.out.println(count);
    }
}

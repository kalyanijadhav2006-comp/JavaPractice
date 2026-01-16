import java.util.Scanner;

public class MaxMinNoinArray{
    public static void main(String argss[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > max ){
                max = numbers[i];
            }

            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Largest number is:" + max);
        System.out.println("Smallest number is:" + min);
    }
}
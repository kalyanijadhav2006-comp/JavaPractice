import java.util.Scanner;


public class Marks{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        int input;
            
        do{
            int marks = sc.nextInt();
            if(marks >=90 && marks <= 100){
                System.out.println("This is Good");
            }else if ( marks <= 89 &&  marks>=60) {
                System.out.println("This is also Good");
            }else if ( marks <= 59 &&  marks>= 0){
                System.out.println("This is Good as well");
            }else{
                System.out.println("Invalid");
            }
            System.out.println("Do you want to continue(Yes(1)or No(0))");
            input = sc.nextInt();
        }
        while(input == 1);
    }
}
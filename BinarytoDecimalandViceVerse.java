import java.util.Scanner;

public class BinarytoDecimalandViceVerse {

    public static String decimaltobinary(int decimal){
        if(decimal == 0){
            return "0";
        }
        String binary = "";
        while(decimal > 0){
            int reminder = decimal % 2;
            binary = binary + reminder;
            decimal = decimal / 2;
        }
        return binary;
    }

    public static int binarytodecimal(int binary){
        int decimal = 0;
        int power = 0;

        while(binary > 0){
            int lastDigit = binary % 10;
            decimal += lastDigit * (int) Math.pow(2, power);
            power++;
            binary = binary / 10;
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---- Number System Converter ----");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter Decimal No:");
            int decimal = sc.nextInt();
            System.out.println("Binary value:" + decimaltobinary(decimal));
        }
        else if(choice == 2){
            System.out.println("Enter binary No:");
            int binary = sc.nextInt();
            System.out.println("Decimal value:" + binarytodecimal(binary));
        }
        else{
            System.out.println("Invalid choice!");
        }
    }
}
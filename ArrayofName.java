import java.util.Scanner;

public class ArrayofName{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String Names[] = new String [n];

        //intput from user
        for(int i=0; i<n; i++){
            Names[i] = sc.next();
        }
        //Output
        for(int i=0; i<n; i++){
            System.out.println(Names[i] + " ");
        }
    }
}
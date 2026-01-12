import java.util.Scanner;

public class Functiontable{

    static int Table(int n, int i){
        int table = n*i;
        return table;
        
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + Table(n,i));
        }
    }
}
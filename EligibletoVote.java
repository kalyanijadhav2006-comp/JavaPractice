import java.util.Scanner;

public class EligibletoVote {

    static boolean checkvote(int age){
        if(age>=18){
            return true;
            //System.out.println("Eligible Fot Votting");
        }else{
            return false;
           // System.out.println("NOt Eligible for Votting");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(checkvote(age)){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}

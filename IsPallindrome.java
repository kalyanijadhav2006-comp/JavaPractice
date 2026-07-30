import java.util.Scanner;
class IsPallindrome {
    public static Boolean solution(int x){
        if(x <= 0){
            return false;
        }

        int original = x;
        int reverse = 0;

        while(x> 0){
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x/10;
        }
        return original == reverse;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        Boolean result = solution(x);
        System.out.println(result);
    }
}

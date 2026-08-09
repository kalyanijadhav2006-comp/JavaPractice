import java.util.Scanner;
public class DeleteString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '@'){
                break;
            }else{
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
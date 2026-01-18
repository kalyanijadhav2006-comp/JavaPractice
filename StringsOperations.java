import java.util.Scanner;

public class StringsOperations{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //printing simple string
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        String Fname = sc.nextLine();
        Fname = fname + " " +lname;
        System.out.println(Fname);

        //concatenation
        System.out.println(fname+lname);

        //lenght of string
        System.out.println(Fname.length());

        //no of caracters in string
        for(int i=0; i<Fname.length(); i++){
            System.out.println(Fname.charAt(i));
        }

        //compare
        //cases for campare
        // 1. s1 > s2 - positive value
        // 2. s1 == s2 - equal
        // 3. s1 < s2 - negative value

        if(fname.compareTo(lname) == 0){
            System.out.print("Strings are equal.");
        }else if(fname.compareTo(lname) > 0){
            System.out.println("fname is greater than lname.");
        }else{
            System.out.println("fname is less than lname");
        }

        //substring(beg index, ending index)
        String name = fname.substring(0,7);
        System.out.println(name);
    }
}


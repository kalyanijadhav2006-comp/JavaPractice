import java.util.*;

public class StringBuilderOperations{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        //print Any String
        System.out.println(sb);

        //Print Char at index 0
        System.out.println (sb.charAt(0));

        //Set char at inddex 0
        sb.setCharAt(0,'p');
        System.out.println(sb);

        //Insertin at 2 index
        sb.insert(2,'n');
        System.out.println(sb);

        //deletion
        sb.delete(2,3);
        System.out.println(sb);

        //append
        sb.append("i");
        sb.append("s");
        sb.append("b");
        sb.append("o");
        sb.append("y");
        System.out.println(sb);

        //length
        System.out.println(sb.length());
    }
}
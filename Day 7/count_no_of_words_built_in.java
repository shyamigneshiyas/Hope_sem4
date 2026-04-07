/*Input: "Hi       hello   how    are   you  " */
import java.util.*;
public class count_no_of_words_built_in{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String str=s.trim();
    
    String[] a=str.split("\\s+");
    System.out.print(a.length);
    }
}
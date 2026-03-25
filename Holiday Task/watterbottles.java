import java.util.*;
public class watterbottles {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bottle=sc.nextInt();
        int exchange=sc.nextInt();
        System.out.print(bottle+((bottle-1)/(exchange-1)));
    }
}

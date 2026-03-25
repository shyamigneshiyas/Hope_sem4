import java.util.*;
public class revInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int rev=0;
        while(x!=0){
            int lorev=x%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && lorev > 7)) break;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && lorev < -8)) break;
            rev=rev*10+lorev;
            x/=10;
        }
        System.out.print(rev);
    }
}

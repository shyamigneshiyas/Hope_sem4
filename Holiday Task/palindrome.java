import java.util.*;
public class palindrome{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int dup=n;
        int rev=0;
        while(n>0){
            int num=n%10;
            rev=rev*10+num;
            n/=10;

        }
        if(rev==dup) System.out.print(true);
        else System.out.print(false);

    }
}
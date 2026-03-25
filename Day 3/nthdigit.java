import java.util.*;
public class nthdigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         long digit=1;
        long start=1;
        int count=9;

        while(n>digit*count){
            n-=digit*count;
            digit++;
            count*=10;
            start*=10;
        }
        long num=start+(n-1)/digit;
        int ind=(int)((n-1)%digit);
        String numstr=Long.toString(num);
        System.out.print(numstr.charAt(ind)-'0');
    }
}

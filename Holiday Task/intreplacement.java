import java.util.*;
public class intreplacement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=1){
            if(n%2==0) n/=2;
            else{
                if(n==3 || n%4==1) n--;
                else n++;
            }
            count++;
        }
        System.out.print(count);
    }
}

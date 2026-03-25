import java.util.*;
public class facttrailingzeroes {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    while(n>0){
        n/=5;
        count+=n;
    }
    System.out.print(count);
   }
    
}

import java.util.*;
public class poweroffour {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&(n-1))==0 && (n&0x55555555)!=0) System.out.print(true);
        else System.out.print(false);
        
    } 
}

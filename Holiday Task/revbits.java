import java.util.*;
public class revbits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for(int i=0;i<32;i++){
            int last=n&1;
            res=res<<1;
            res=res|last;
            n=n>>1;
        }
        System.out.print(res);
    }
}

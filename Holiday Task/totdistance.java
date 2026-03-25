import java.util.*;
public class totdistance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int main=sc.nextInt();
        int sub=sc.nextInt();
        
        int extra=Math.min((main-1)/4,sub);
        int tot=main+extra;
        System.out.print(10*tot);
    }
}

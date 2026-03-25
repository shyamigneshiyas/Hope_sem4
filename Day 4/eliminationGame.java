import java.util.*;
public class eliminationGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=1;
        int step=1;
        boolean left=true;
        while(n>1){
            if(left||n%2!=0){
                start=step+start;
            }
            n/=2;
            step*=2;
            left=!left;
    
        }
        System.out.print(start);
    }

}
